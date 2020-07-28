package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import com.crewtocol.domain.user.User;

import lombok.Getter;

@Getter
public class StudyResponseDto {

    private long id;
    private String title;
    private String content;
    private User user;
    private String language;
    private String location;
    private int headCount;

    public StudyResponseDto(Study entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.user = entity.getUser();
        this.language = entity.getLanguage();
        this.location = entity.getLocation();
        this.headCount = entity.getHeadCount();
    }
}
