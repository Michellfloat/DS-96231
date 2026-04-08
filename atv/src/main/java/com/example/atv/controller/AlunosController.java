package com.example.atv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.atv.models.AlunosModel;
import com.example.atv.repository.AlunosRepository;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
    @Autowired

    private AlunosRepository alunosRepository;

    @GetMapping
    public List<AlunosModel>listarAlunos(){
        return alunosRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunosModel>cadastrarAlunos(@RequestBody AlunosModel alunos){
        alunosRepository.save(alunos);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunos);
    }
}
