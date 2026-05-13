package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AlunoRequestDTO;
import com.example.demo.dto.AlunoResponseDTO;
import com.example.demo.service.AlunoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    ResponseEntity<List<AlunoResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.listarAlunos());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody AlunoRequestDTO alunoDTO){
        alunoService.salvarAlunos(alunoDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Aluno salvo com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody AlunoRequestDTO alunoDTO){
        alunoService.atualizarAlunos(id, alunoDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        alunoService.deletarAlunos(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno salvo com sucesso!"));
    }
}
