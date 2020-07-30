package com.crewtocol.web.dto;

import com.crewtocol.domain.creply.Creply;
import com.crewtocol.domain.user.User;
import com.crewtocol.domain.community.Community;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreplySaveRequestDto {
    private String content;
    private User user;
    private Community community;

    @Builder
    public CreplySaveRequestDto(String content, User user, Community community){
        this.content = content;
        this.user = user;
        this.community = community;
    }

    public Creply toEntity() {
        return Creply.builder()
                .content(content)
                .user(user)
                .community(community)
                .build();
    }
}