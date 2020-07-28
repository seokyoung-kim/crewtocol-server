package com.crewtocol.web.dto;

import com.crewtocol.domain.community.Community;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommunitySaveRequestDto {
    private String title;
    private String content;
    private String author;
    private int headCount;

    @Builder
    public CommunitySaveRequestDto(String title, String content, String author, int headCount) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.headCount = headCount;
    }

    public Community toEntity(){
        return Community.builder()
                .title(title)
                .content(content)
                .author(author)
                .headCount(headCount)
                .build();
    }
}