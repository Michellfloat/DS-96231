package com.example.atv.controller;

import com.example.atv.models.FuncionarioModelAntigo;
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

import com.example.atv.service.FuncionarioServiceAntigo;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioControllerAntigo {
    @Autowired
    private FuncionarioServiceAntigo funcionarioService;

    
    @GetMapping
    public List<FuncionarioModelAntigo>salvar(){
        return funcionarioService.salvarFuncionarios();
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>>cadastrar(@RequestBody FuncionarioModelAntigo funcionario){
        funcionarioService.cadastrarFuncionarios(funcionario);

        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Funcionário Cadastrado com sucesso!"));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(
        @PathVariable Long id,
        @RequestBody FuncionarioModelAntigo funcionario){
            funcionarioService.atualizarFuncionario(id, funcionario);

            return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Funcionario atualizado!!"));
        }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(
        @PathVariable Long id){
            funcionarioService.excluirFuncionario(id);

            return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Funcionario excluído!!"));
        }
}
