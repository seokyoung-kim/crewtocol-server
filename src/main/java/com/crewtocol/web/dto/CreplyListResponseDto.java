package com.crewtocol.web.dto;

import com.crewtocol.domain.creply.Creply;
import com.crewtocol.domain.user.User;
import com.crewtocol.domain.community.Community;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreplyListResponseDto {
    private Long id;
    private String content;
    private User user;
    private Community community;
    private LocalDateTime createdDate;

    public CreplyListResponseDto(Creply entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.user = entity.getUser();
        this.community = entity.getCommunity();
        this.createdDate = entity.getCreatedDate();
    }
}