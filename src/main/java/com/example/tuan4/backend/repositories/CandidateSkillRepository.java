package com.example.tuan4.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tuan4.backend.models.CandidateSkill;
import com.example.tuan4.backend.models.Skill;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {
}