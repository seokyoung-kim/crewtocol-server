package com.crewtocol.web.dto;

import com.crewtocol.domain.sreply.Sreply;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SreplySaveRequestDto {
    private String content;
    private User user;

    @Builder
    public SreplySaveRequestDto(String content, User user) {
        this.content = content;
        this.user = user;
    }

    public Sreply toEntity() {
        return Sreply.builder()
                .content(content)
                .user(user)
                .build();
    }
}