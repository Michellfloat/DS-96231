package com.example.sec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sec.dto.CenarioRequestDTO;
import com.example.sec.dto.CenarioResponseDTO;
import com.example.sec.service.CenarioService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/cenarios")
public class CenarioController {
    @Autowired
    private CenarioService cenarioService;

    @GetMapping
    public ResponseEntity<List<CenarioResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(cenarioService.listarCenarios());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody CenarioRequestDTO dto){
        cenarioService.salvarCenarios(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Cenário cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody CenarioRequestDTO dto) {
        cenarioService.atualizarCenario(id, dto);
        
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Dados do cenário atualizados!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        cenarioService.deletarCenario(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Cenário deletado!"));
    }
}
