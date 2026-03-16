package com.example.atv1;

public class Multiplicacao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        double multiplicacao = a*b;
        return multiplicacao;
    }
}
