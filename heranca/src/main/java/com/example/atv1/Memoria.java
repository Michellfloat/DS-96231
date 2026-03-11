package com.example.atv1;

public class Memoria extends CPU{
    private String capacidadeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    
}
