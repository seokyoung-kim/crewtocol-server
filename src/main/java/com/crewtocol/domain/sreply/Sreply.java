package com.crewtocol.domain.sreply;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.study.Study;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Sreply extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    //USER_ID 연관 매핑
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "STUDY_ID")
    private Study study;

    @Builder
    public Sreply(String content, User user) {
        this.content = content;
        this.user = user;
    }

    public void update(String content) {
        this.content = content;   
    }
}