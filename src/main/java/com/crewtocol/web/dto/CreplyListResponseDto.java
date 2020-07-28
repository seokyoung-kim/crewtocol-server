package com.crewtocol.web.dto;

import com.crewtocol.domain.creply.Creply;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreplyListResponseDto {
    private Long id;
    private String content;
    private String author;
    private LocalDateTime createdDate;

    public CreplyListResponseDto(Creply entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}