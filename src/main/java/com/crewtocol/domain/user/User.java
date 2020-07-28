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
    @Column(name = "USER_ID")
    private Long id;

    private String email;

    private String author;

    private String password;

    private int option;

    @Builder
    public User(String email, String author, String password, int option){
        this.email = email;
        this.author = author;
        this.password = password;
        this.option = option;
    }

    public void update(String email, String password, int option){
        this.email = email;
        this.password = password;
        this.option = option;
    }
}