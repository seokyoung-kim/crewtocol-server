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
    @Column(name = "COMMUNITY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private int headCount;

    //author 연관 매핑(FK)
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @OneToMany(mappedBy = "community")
    private List<Creply> sreplys = new ArrayList<Creply>();

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