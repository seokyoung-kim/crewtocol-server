package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommunitySaveRequestDto {
    private String title;
    private String content;
    private User user;
    private int headCount;

    @Builder
    public CommunitySaveRequestDto(String title, String content, User user, int headCount) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.headCount = headCount;
    }

    public Community toEntity(){
        return Community.builder()
                .title(title)
                .content(content)
                .user(user)
                .headCount(headCount)
                .build();
    }
}