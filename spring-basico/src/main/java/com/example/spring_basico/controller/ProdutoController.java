package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_basico.models.ProdutoModel;
import com.example.spring_basico.repository.ProdutoRepository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    
    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> salvarProdutos(@RequestBody ProdutoModel produto){
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }
}
    

