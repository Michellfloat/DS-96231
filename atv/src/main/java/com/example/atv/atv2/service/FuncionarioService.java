package com.example.atv.atv2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.atv.atv2.model.FuncionarioModel;
import com.example.atv.atv2.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @GetMapping 
    public List<FuncionarioModel>listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public FuncionarioModel salvarFuncionarios(FuncionarioModel funcionario){
        if (funcionarioRepository.findById(funcionario.getId()).isPresent()) {

            throw new RuntimeException("Funcionário já existente!!");

        }
        return funcionarioRepository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionarios(Long id, FuncionarioModel funcionario){
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado!!");
        }
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionarios(Long id){
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado!!");
        }
        funcionarioRepository.deleteById(id);
    }
}
