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

import com.example.demo.dto.ColaboradorRequestDTO;
import com.example.demo.dto.ColaboradorResponseDTO;
import com.example.demo.service.ColaboradorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {
    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    ResponseEntity<List<ColaboradorResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.listarColaboradores());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody ColaboradorRequestDTO colaboradorDTO){
        colaboradorService.salvarColaboradores(colaboradorDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Colaborador salvo com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody ColaboradorRequestDTO colaboradorDTO){
        colaboradorService.atualizarColaboradores(id, colaboradorDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Colaborador atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        colaboradorService.deletarColaboradores(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Colaborador deletado com sucesso!"));
    }
}
