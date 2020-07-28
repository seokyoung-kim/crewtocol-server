package com.crewtocol.web.dto;

import com.crewtocol.domain.user.User;
import lombok.Getter;

@Getter
public class UserListResponseDto {
    private Long id;
    private String email;
    private String author;
    private String password;
    private int opt;

    public UserListResponseDto(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.author = entity.getAuthor();
        this.password = entity.getPassword();
        this.opt = entity.getOpt();
    }
}