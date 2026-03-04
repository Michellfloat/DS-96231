package com.example.revisao.atv1;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Cliente(Endereco endereco, int idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }  
    
    
    public int getIdade() {
        return idade;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
}
