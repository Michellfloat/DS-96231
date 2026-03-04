package com.example.revisao.atv2;

public class Cliente {
    private String nome;
    private int idade;
    private Pet pet;

    public Cliente(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Pet getPet() {
        return pet;
    }
    
}
