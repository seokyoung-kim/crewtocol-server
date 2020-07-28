package com.crewtocol.domain.creply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreplyRepository extends JpaRepository<Creply,Long> {
    @Query("SELECT p.id,p.content,q.author,p.createdDate FROM Creply p User q ON p.user=q.id ORDER BY p.id DESC")
    List<Creply> findAllDesc();
}