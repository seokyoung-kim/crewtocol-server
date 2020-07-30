package com.crewtocol.web.dto;

import com.crewtocol.domain.bookmark.Bookmark;
import com.crewtocol.domain.study.Study;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookmarkSaveRequestDto {
    private String uri;
    private Study study;

    @Builder
    public BookmarkSaveRequestDto(String uri, Study study){
        this.uri = uri;
        this.study = study;
    }

    public Bookmark toEntity(){
        return Bookmark.builder()
                .uri(uri)
                .study(study)
                .build();
    }
}