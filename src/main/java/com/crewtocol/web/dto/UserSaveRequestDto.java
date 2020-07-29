package com.crewtocol.web.dto;

import com.crewtocol.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String email;
    private String author;
    private String password;
    private int opt;

    @Builder
    public UserSaveRequestDto(String email, String author, String password, int opt) {
        this.email = email;
        this.author = author;
        this.password = password;
        this.opt = opt;
    }

    public User toEntity() {
        return User.builder()  
                .email(email)
                .author(author)
                .password(password)
                .opt(opt)
                .build();
    }
}
