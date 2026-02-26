package com.example.construtores;

public class Construtor {
    private String nome;
    private int idade;

    // Construtor
    public Construtor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
