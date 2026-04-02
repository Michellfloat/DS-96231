package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.FuncModel;
import com.example.api.repository.FuncRepository;


@RestController
@RequestMapping("/funcionarios")
public class FuncController {
    @Autowired
    private FuncRepository funcRepository;

    @GetMapping
    public List<FuncModel> listarTodos(){
        return funcRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncModel>salvar(@RequestBody FuncModel funcionario){
        funcRepository.save(funcionario);
    return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }

}
