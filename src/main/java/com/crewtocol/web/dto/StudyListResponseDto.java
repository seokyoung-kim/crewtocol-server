package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class StudyListResponseDto {
    private Long id;
    private String title;
    private String author;
    private String language;
    private String location;
    private LocalDate modifiedDate;
    private int headCount;

    public StudyListResponseDto(Study entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.language = entity.getLanguage();
        this.location = entity.getLocation();
        this.modifiedDate = entity.getModifiedDate();
        this.headCount = entity.getHeadCount();
    }
}
