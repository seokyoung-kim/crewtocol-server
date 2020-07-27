package com.crewtocol.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudyUpdateRequestDto {
    private String title;
    private String content;
    private String language;
    private String location;
    private int headCount;

    @Builder
    public StudyUpdateRequestDto(String title, String content, String language, String location, int headCount) {
        this.title = title;
        this.content = content;
        this.language = language;
        this.location = location;
        this.headCount = headCount;
    }
}
