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

import com.example.demo.dto.CursoRequestDTO;
import com.example.demo.dto.CursoResponseDTO;
import com.example.demo.service.CursoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    ResponseEntity<List<CursoResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.listarCursos());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody CursoRequestDTO cursoDTO){
        cursoService.salvarCursos(cursoDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Aluno salvo com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody CursoRequestDTO cursoDTO){
        cursoService.atualizarCursos(id, cursoDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        cursoService.deletarCursos(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno salvo com sucesso!"));
    }
}
