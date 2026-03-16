package com.example.atv1;

public class Divisao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        double divisao = a/b;
        return divisao;
    }
}
