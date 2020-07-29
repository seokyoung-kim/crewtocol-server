package com.crewtocol.domain.sreply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SreplyRepository extends JpaRepository<Sreply,Long> {
    @Query("SELECT p FROM Sreply p ORDER BY p.id DESC")
    List<Sreply> findAllDesc();
}