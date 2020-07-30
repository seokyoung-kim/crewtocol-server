package com.crewtocol.web.dto;

import com.crewtocol.domain.bookmark.Bookmark;
import com.crewtocol.domain.study.Study;

import lombok.Getter;

@Getter
public class BookmarkListResponseDto {
    private Long id;
    private String uri;
    private Study study;

    public BookmarkListResponseDto(Bookmark entity) {
        this.id = entity.getId();
        this.uri = entity.getUri();
        this.study = entity.getStudy();
    }
}