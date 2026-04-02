package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.FornModel;
import com.example.api.model.FuncModel;
import com.example.api.repository.FornRepository;

@RestController
@RequestMapping("/fornecedores")
public class FornController {
    @Autowired
    private FornRepository fornecedor;
    
    @GetMapping
    public List<FornModel>listarTodos(){
        return fornecedor.findAll();
    }

    @PostMapping
    public ResponseEntity<FornModel>salvar(@RequestBody FornModel fornecedor){
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
    }
}
