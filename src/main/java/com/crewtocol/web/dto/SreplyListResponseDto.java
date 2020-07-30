package com.crewtocol.web.dto;

import com.crewtocol.domain.sreply.Sreply;
import com.crewtocol.domain.user.User;
import com.crewtocol.domain.study.Study;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SreplyListResponseDto {
    private Long id;
    private String content;
    private User user;
    private Study study;
    private LocalDateTime createdDate;

    public SreplyListResponseDto(Sreply entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.user = entity.getUser();
        this.study = entity.getStudy();
        this.createdDate = entity.getCreatedDate();
    }
}