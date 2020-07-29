package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import com.crewtocol.domain.user.User;

import lombok.Getter;

@Getter
public class CommunityResponseDto {
    
    private long id;
    private String title;
    private String content;
    private User user;
    private int headCount;

    public CommunityResponseDto(Community entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.user = entity.getUser();
        this.headCount = entity.getHeadCount();
    }
}