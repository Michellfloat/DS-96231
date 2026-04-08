package com.example.servico.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.servico.model.FuncionarioModel;
import com.example.servico.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<FuncionarioModel>listar(){
        return funcionarioService.listarFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>>cadastrar(@RequestBody FuncionarioModel funcionario){
        funcionarioService.salvarFuncionarios(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Funcionário cadastrado co sucesso!!!"));
    }
}
