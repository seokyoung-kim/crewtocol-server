package com.crewtocol.web.dto;

import com.crewtocol.domain.creply.Creply;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreplySaveRequestDto {
    private String content;
    private User user;

    @Builder
    public CreplySaveRequestDto(String content, User user) {
        this.content = content;
        this.user = user;
    }

    public Creply toEntity() {
        return Creply.builder()
                .content(content)
                .user(user)
                .build();
    }
}