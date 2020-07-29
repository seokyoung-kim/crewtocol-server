package com.crewtocol.domain.creply;

import com.crewtocol.domain.BaseTimeEntity;
import com.crewtocol.domain.community.Community;
import com.crewtocol.domain.user.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Creply extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    //닉네임 연관 매핑
    @ManyToOne
    @JoinColumn(name="author")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "COMMUNITY_ID")
    private Community community;

    @Builder
    public Creply(String content, User user) {
        this.content = content;
        this.user = user;
    }

    public void update(String content) {
        this.content = content;
    }
}