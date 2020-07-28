package com.crewtocol.domain.study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;



public interface StudyRepository extends JpaRepository<Study, Long> {

    @Query("SELECT p.id,p.title,q.author,p.language,p.location,p.modifiedDate FROM Study p User q Where p.user = q.id ORDER BY p.id DESC")
    List<Study> findAllDesc();

    @Query("SELECT p.id,p.title,p.content,q.author,p.language,p.location,p.headCount FROM Study p User q Where p.user = q.id")
    Optional<Study> findById(Long id);
}
