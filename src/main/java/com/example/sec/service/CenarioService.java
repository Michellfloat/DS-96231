package com.example.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sec.repository.CenarioRepository;

@Service
public class CenarioService {
    @Autowired
    private CenarioRepository cenarioRepository;

    
}
