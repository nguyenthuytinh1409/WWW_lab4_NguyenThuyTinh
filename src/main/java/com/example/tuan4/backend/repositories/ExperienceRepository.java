package com.example.tuan4.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tuan4.backend.models.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}