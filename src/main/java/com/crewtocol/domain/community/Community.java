package com.crewtocol.domain.community;

import com.crewtocol.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Community extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    private int headCount;

    @Builder
    public Community(String title, String content, String author, int headCount) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.headCount = headCount;
    }

    public void update(String title, String content, int headCount) {
        this.title = title;
        this.content = content;
        this.headCount = headCount;
    }
}