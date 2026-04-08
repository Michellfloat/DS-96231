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

import com.example.atv.models.PetModels;
import com.example.atv.repository.PetRepository;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetRepository petRepository;
    @GetMapping
    public List<PetModels>listarTodos(){
        return petRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<PetModels>salvar(@RequestBody PetModels pet){
        return ResponseEntity.status(HttpStatus.CREATED).body(pet);
    }
}
