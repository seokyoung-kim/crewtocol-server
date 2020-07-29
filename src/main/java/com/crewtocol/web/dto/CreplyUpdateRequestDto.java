package com.crewtocol.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreplyUpdateRequestDto {
    private String content;

    @Builder
    public CreplyUpdateRequestDto(String content){
        this.content = content;
    } 
}