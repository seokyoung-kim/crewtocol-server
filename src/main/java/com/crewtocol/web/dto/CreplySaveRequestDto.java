package com.crewtocol.web.dto;

import com.crewtocol.domain.creply.Creply;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreplySaveRequestDto {
    private String content;
    private String author;

    @Builder
    public CreplySaveRequestDto(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public Creply toEntity() {
        return Creply.builder()
                .content(content)
                .author(author)
                .build();
    }
}