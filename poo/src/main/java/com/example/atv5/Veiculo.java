package com.example.atv5;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capacidadeDoTanque;
    private double velocidadeMaxima;
    private double consumoDeCombustivel;

    public Veiculo(String placa, String cor, int numeroDePassageiros, double capacidadeDoTanque, double velocidadeMaxima, double consumoDeCombustivel) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoDeCombustivel = consumoDeCombustivel;
    }


    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getConsumoDeCombustivel() {
        return consumoDeCombustivel;
    }

    
}
