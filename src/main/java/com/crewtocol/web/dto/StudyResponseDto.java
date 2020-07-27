package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import lombok.Getter;

@Getter
public class StudyResponseDto {

    private long id;
    private String title;
    private String content;
    private String author;
    private String language;
    private String location;
    private int headCount;

    public StudyResponseDto(Study entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.language = entity.getLanguage();
        this.location = entity.getLocation();
        this.headCount = entity.getHeadCount();
    }
}
