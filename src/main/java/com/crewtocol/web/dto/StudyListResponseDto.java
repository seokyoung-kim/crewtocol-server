package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import com.crewtocol.domain.user.User;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StudyListResponseDto {
    private Long id;
    private String title;
    private User user;
    private String language;
    private String location;
    private LocalDateTime modifiedDate;

    public StudyListResponseDto(Study entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.user = entity.getUser();
        this.language = entity.getLanguage();
        this.location = entity.getLocation();
        this.modifiedDate = entity.getModifiedDate();
    }
}
