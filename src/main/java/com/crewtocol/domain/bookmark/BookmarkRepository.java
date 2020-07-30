package com.crewtocol.domain.bookmark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    
    @Query("SELECT p FROM Bookmark p ORDER BY p.id DESC")
    List<Bookmark> findAllDesc();

}