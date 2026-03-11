package com.example.complementar;

public abstract class Veiculo {
    protected String marca;
    protected double velocidade;

    public void acelerar(double incremento){
        this.velocidade += incremento;
    }

    public Veiculo(String marca, double velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", velocidade=" + velocidade + "]";
    }

    
}
