package com.example.tuan4.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tuan4.backend.models.JobSkill;
import com.example.tuan4.backend.models.Skill;

public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
}