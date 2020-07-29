package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import com.crewtocol.domain.user.User;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommunityListResponseDto {
    private Long id;
    private String title;
    private User user;
    private LocalDateTime createdDate;

    public CommunityListResponseDto(Community entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.user = entity.getUser();
        this.createdDate = entity.getCreatedDate();
    }
}