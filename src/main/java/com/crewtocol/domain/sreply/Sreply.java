package com.crewtocol.domain.sreply;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.study.Study;

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

    private String author;

    @ManyToOne
    @JoinColumn(name = "STUDY_ID")
    private Study study;

    @Builder
    public Sreply(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void update(String content) {
        this.content = content;   
    }
}