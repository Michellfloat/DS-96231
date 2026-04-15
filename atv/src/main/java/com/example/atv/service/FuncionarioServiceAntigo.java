package com.example.atv.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.atv.models.FuncionarioModelAntigo;
import com.example.atv.repository.FuncionarioRepositoryAntigo;

@Service
public class FuncionarioServiceAntigo {

    @Autowired
    private FuncionarioRepositoryAntigo funcionarioRepository;
    @GetMapping
    public List<FuncionarioModelAntigo>salvarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public FuncionarioModelAntigo cadastrarFuncionarios(FuncionarioModelAntigo funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já existente no sistema");
        }
        
        return funcionarioRepository.save(funcionario);
        
    }
    public FuncionarioModelAntigo atualizarFuncionario(Long id, FuncionarioModelAntigo funcionario){
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado!");
        }
        /*Mantém o id para não criar outro funcionario.
        Altera todos os outros dados */
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(Long id){
        if(!funcionarioRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado.");
        }
        funcionarioRepository.deleteById(id);
    }


}
