package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudySaveRequestDto {
    private String title;
    private String content;
    private String author;
    private String language;
    private String location;
    private int headCount;

    @Builder
    public StudySaveRequestDto(String title, String content, String author, String language, String location, int headCount) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.language = language;
        this.location = location;
        this.headCount = headCount;
    }

    public Study toEntity() {
        return Study.builder()
                .title(title)
                .content(content)
                .author(author)
                .language(language)
                .location(location)
                .headCount(headCount)
                .build();
    }
}
