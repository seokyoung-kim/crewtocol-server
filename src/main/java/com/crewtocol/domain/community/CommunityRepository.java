package com.crewtocol.domain.community;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface CommunityRepository extends JpaRepository<Community, Long> {
    
    @Query("SELECT p,q.author FROM Community p, User q WHERE p.user = q.id ORDER BY p.id DESC")
    List<Community> findAllDesc();

}