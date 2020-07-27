package com.crewtocol.domain.study;

import com.crewtocol.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Study extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    private String location;

    private String language;

    private int headCount;

    @Builder
    public Study(String title, String content, String author, String location, String language, int headCount) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.location = location;
        this.language = language;
        this.headCount = headCount;
    }

    public void update(String title, String content, String language, String location, int headCount) {
        this.title = title;
        this.content = content;
        this.location = location;
        this.language = language;
        this.headCount = headCount;
    }

}
