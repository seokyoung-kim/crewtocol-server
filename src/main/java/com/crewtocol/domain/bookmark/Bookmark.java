package com.crewtocol.domain.bookmark;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.study.Study;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Bookmark extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String uri;

    @ManyToOne
    @JoinColumn(name="STUDY_ID")
    private Study study;

    @Builder
    public Bookmark(String uri, Study study){
        this.uri = uri;
        this.study = study;
    }

    public void update(String uri) {
        this.uri = uri;
    }

}