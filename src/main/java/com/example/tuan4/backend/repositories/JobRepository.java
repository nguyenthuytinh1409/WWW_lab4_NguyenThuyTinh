package com.example.tuan4.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tuan4.backend.models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
