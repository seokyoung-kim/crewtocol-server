package com.crewtocol.domain.community;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    
    @Query("SELECT p.id,p.title,q.author,p.createdDate FROM Community p User q ON p.user = q.id ORDER BY p.id DESC")
    List<Community> findAllDesc();

    @Query("SELECT p.id,p.title,p.content,q.author,p.headCount FROM Community p User q ON p.user = q.id")
    Optional<Community> findById(Long id);
}