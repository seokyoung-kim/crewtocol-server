package com.crewtocol.web.dto;

import com.crewtocol.domain.study.Study;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudySaveRequestDto {
    private String title;
    private String content;
    private User user;
    private String language;
    private String location;
    private int headCount;

    @Builder
    public StudySaveRequestDto(String title, String content, User user, String language, String location, int headCount) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.language = language;
        this.location = location;
        this.headCount = headCount;
    }

    public Study toEntity() {
        return Study.builder()
                .title(title)
                .content(content)
                .user(user)
                .language(language)
                .location(location)
                .headCount(headCount)
                .build();
    }
}
