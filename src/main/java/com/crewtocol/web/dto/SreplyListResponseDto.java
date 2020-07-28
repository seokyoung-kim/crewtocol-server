package com.crewtocol.web.dto;

import com.crewtocol.domain.sreply.Sreply;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SreplyListResponseDto {
    private Long id;
    private String content;
    private String author;
    private LocalDateTime createdDate;

    public SreplyListResponseDto(Sreply entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}