package com.example.servico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.servico.model.FuncionarioModel;
import com.example.servico.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired


    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel>listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvarFuncionarios(FuncionarioModel funcionario){
        if (funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionário já existente!!");
        }
        return funcionarioRepository.save(funcionario);
    }

}
