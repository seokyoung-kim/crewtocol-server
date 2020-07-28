package com.crewtocol.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommunityUpdateRequestDto {
    private String title;
    private String content;
    private int headCount;

    @Builder
    public CommunityUpdateRequestDto(String title, String content, int headCount) {
        this.title = title;
        this.content = content;
        this.headCount = headCount;
    }
}