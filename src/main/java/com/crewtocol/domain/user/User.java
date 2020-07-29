package com.crewtocol.domain.user;

import com.crewtocol.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(name = "author")
    private String author;

    private String password;

    private int opt;

    @Builder
    public User(String email, String author, String password, int opt){
        this.email = email;
        this.author = author;
        this.password = password;
        this.opt = opt;
    }

    public void update(String email, String password, int opt){
        this.email = email;
        this.password = password;
        this.opt = opt;
    }
}