package com.example.atv4;

public enum Bonificacao {
    GERENTE(1.2),
    DIRETOR(1.4);

    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
