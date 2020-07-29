package com.crewtocol.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {
    
    private String email;
    private String author;
    private String password;
    private int opt;

    @Builder
    public UserUpdateRequestDto(String email, String author, String password, int opt){
        this.email = email;
        this.author = author;
        this.password = password;
        this.opt = opt;
    }

}