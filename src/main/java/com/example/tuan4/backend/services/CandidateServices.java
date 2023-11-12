package com.example.tuan4.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.example.tuan4.backend.models.Candidate;
import com.example.tuan4.backend.repositories.CandidateRepository;

import java.util.Collections;
import java.util.List;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;
    public Candidate findByEmail(String email) {
        return candidateRepository.findByEmail(email);
    }
}
