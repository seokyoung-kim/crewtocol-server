package com.crewtocol.domain.sreply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SreplyRepository extends JpaRepository<Sreply,Long> {
    @Query("SELECT p.id,p.content,q.author,p.createdDate FROM Sreply p User q ON p.user=q.id ORDER BY p.id DESC")
    List<Sreply> findAllDesc();
}