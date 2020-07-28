package com.crewtocol.domain.study;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.sreply.Sreply;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Study extends BaseTimeEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDY_ID")
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String location;

    private String language;

    private int headCount;

    //USER_ID 연관 매핑
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    //1:N 댓글
    @OneToMany(mappedBy = "study")
    private List<Sreply> sreplys = new ArrayList<Sreply>();

    @Builder
    public Study(String title, String content,User user, String location, String language, int headCount) {
        this.title = title;
        this.content = content;
        this.user = user;
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
