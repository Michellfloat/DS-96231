package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.dto.FuncionarioRequestDTO;
import com.example.demo.dto.FuncionarioResponseDTO;

import com.example.demo.model.FuncionarioModel;

import com.example.demo.repository.FuncionarioRepository;

import jakarta.transaction.Transactional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    

    public FuncionarioModel salvarFuncionarios(FuncionarioRequestDTO funcionario){
        if (funcionarioRepository.findByMatricula(funcionario.getMatricula()).isPresent()) {
            throw new RuntimeException("funcionario já cadastrado!");
        }
        FuncionarioModel novFuncionario = new FuncionarioModel();
        novFuncionario.setNome(funcionario.getNome());
        novFuncionario.setMatricula(funcionario.getMatricula());
        novFuncionario.setDataNascimento(funcionario.getDataNascimento());
        novFuncionario.setSalario(funcionario.getSalario());
        novFuncionario.setEmail(funcionario.getEmail());
        novFuncionario.setEndereco(funcionario.getEndereco());
        

        return funcionarioRepository.save(novFuncionario);
    }

    public List<FuncionarioResponseDTO>listarFuncionarios(){
        return funcionarioRepository.findAll().stream().map(f -> new FuncionarioResponseDTO(f.getNome(),f.getDataNascimento(),f.getSalario(),f.getEmail(),f.getEndereco())).toList();
    }

    @Transactional
    public FuncionarioResponseDTO atualizarFuncionarios(Long id, FuncionarioRequestDTO funcionario){
        FuncionarioModel funcionarioExiste = funcionarioRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este funcionário não existe!"));
        
        funcionarioExiste.setNome(funcionario.getNome());
        funcionarioExiste.setMatricula(funcionario.getMatricula());
        funcionarioExiste.setDataNascimento(funcionario.getDataNascimento());
        funcionarioExiste.setSalario(funcionario.getSalario());
        funcionarioExiste.setEmail(funcionario.getEmail());
        funcionarioExiste.setEndereco(funcionario.getEndereco());
        
        FuncionarioModel atualizado = funcionarioRepository.save(funcionarioExiste);

        return new FuncionarioResponseDTO(atualizado.getNome(),atualizado.getDataNascimento(),atualizado.getSalario(),atualizado.getEmail(),atualizado.getEndereco());
    }

    @Transactional
    public void deletarFuncionarios(Long id){
        if (!funcionarioRepository.existsById(id)) {
            throw new RuntimeException("Este funcionário não existe!");
        }
        funcionarioRepository.deleteById(id);
    }
}
