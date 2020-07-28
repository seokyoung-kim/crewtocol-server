package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import lombok.Getter;

@Getter
public class CommunityResponseDto {
    
    private long id;
    private String title;
    private String content;
    private String author;
    private int headCount;

    public CommunityResponseDto(Community entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.headCount = entity.getHeadCount();
    }
}