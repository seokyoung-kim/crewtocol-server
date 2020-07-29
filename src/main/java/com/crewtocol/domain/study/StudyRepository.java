package com.crewtocol.domain.study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudyRepository extends JpaRepository<Study, Long> {

    @Query("SELECT p,q.author FROM Study p, User q WHERE p.user = q.id ORDER BY p.id DESC")
    List<Study> findAllDesc();

}
