package com.example.dance.repository;

import com.example.dance.entity.Dance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanceRepository extends JpaRepository<Dance, Long> {
}
