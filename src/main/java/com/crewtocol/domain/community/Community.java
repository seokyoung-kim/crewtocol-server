package com.crewtocol.domain.community;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.creply.Creply;
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
public class Community extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMUNITY_ID")
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private int headCount;

    //USER_ID 연관 매핑
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

     //1:N 댓글
    @OneToMany(mappedBy = "community")
    private List<Creply> creplys = new ArrayList<Creply>();

    @Builder
    public Community(String title, String content, User user, int headCount) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.headCount = headCount;
    }

    public void update(String title, String content, int headCount) {
        this.title = title;
        this.content = content;
        this.headCount = headCount;
    }
}