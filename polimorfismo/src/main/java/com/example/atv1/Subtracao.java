package com.example.atv1;

public class Subtracao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        double subtracao = a-b;
        return subtracao;
    }
}
