package com.example.atv.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.atv.models.FuncionarioModel;
import com.example.atv.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @GetMapping
    public List<FuncionarioModel>salvarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public FuncionarioModel cadastrarFuncionarios(FuncionarioModel funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já existente no sistema");
        }
        
        return funcionarioRepository.save(funcionario);
        
    }
    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario){
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
