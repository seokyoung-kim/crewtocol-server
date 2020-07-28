package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommunityListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime createdDate;

    public CommunityListResponseDto(Community entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}