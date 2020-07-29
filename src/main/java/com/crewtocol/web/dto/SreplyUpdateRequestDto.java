package com.crewtocol.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SreplyUpdateRequestDto {
    private String content;

    @Builder
    public SreplyUpdateRequestDto(String content){
        this.content = content;
    }
}
