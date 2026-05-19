package com.example.demo.dto;

import com.example.demo.model.EnderecoModel;

public class FuncionarioResponseDTO {
    private String nome;
    private String dataNascimento;
    private Double salario;
    private String email;
    private EnderecoModel endereco;
    
    public FuncionarioResponseDTO() {
    }

    public FuncionarioResponseDTO(String nome, String dataNascimento, Double salario, String email,
            EnderecoModel endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    
    
}
