package com.example.atv4;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
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

    public String getPorte() {
        return porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }
    
}
