package com.crewtocol.web.dto;

import com.crewtocol.domain.sreply.Sreply;
import com.crewtocol.domain.user.User;
import com.crewtocol.domain.study.Study;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SreplySaveRequestDto {
    private String content;
    private User user;
    private Study study;

    @Builder
    public SreplySaveRequestDto(String content, User user, Study study) {
        this.content = content;
        this.user = user;
        this.study = study;
    }

    public Sreply toEntity() {
        return Sreply.builder()
                .content(content)
                .user(user)
                .study(study)
                .build();
    }
}