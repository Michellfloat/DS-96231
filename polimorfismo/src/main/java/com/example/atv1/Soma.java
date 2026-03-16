package com.example.atv1;

public class Soma implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        double soma = a+b;
        return soma;
    }
}
