package com.example.atv.atv2.controller;

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

import com.example.atv.atv2.model.FuncionarioModel;
import com.example.atv.atv2.service.FuncionarioService;

@RestController("FuncionarioControllerV2")
@RequestMapping("/funcionariosV2")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<FuncionarioModel>listar(){
        return funcionarioService.listarFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>>cadastrar(@RequestBody FuncionarioModel funcionario){
        funcionarioService.salvarFuncionarios(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Funcionário cadastrado com sucesso!!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizar( @PathVariable Long id,@RequestBody FuncionarioModel funcionario){
            funcionarioService.atualizarFuncionarios(id, funcionario);

            return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Dados do servidor atualizados!!!"));
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>excluir(@PathVariable Long id){
        funcionarioService.excluirFuncionarios(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Funcionário excluído com sucesso!!!"));
    }

}
