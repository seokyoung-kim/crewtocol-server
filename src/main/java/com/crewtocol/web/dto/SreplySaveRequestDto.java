package com.crewtocol.web.dto;

import com.crewtocol.domain.sreply.Sreply;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SreplySaveRequestDto {
    private String content;
    private String author;

    @Builder
    public SreplySaveRequestDto(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public Sreply toEntity() {
        return Sreply.builder()
                .content(content)
                .author(author)
                .build();
    }
}