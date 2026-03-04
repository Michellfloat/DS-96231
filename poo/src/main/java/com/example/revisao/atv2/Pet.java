package com.example.revisao.atv2;

public class Pet {
    private String nome;
    private int idade;
    private String raca;

    public Pet(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getRaca() {
        return raca;
    }
    
}
