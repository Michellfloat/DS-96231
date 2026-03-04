package com.example.revisao.atv3;

public class Funcionario {
    private String codigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;

    public Funcionario(String codigoFuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contaBancaria) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }
    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    

}
