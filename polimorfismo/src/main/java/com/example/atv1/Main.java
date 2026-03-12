package com.example.atv1;

public class Main {
    public static void main(String[] args) {
        System.out.println("operadores matemáticos de 2 valores:");

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.println(soma.calcular(5, 5));
        System.out.println(subtracao.calcular(5, 5));
        System.out.println(divisao.calcular(5, 5));
        System.out.println(multiplicacao.calcular(5, 5));
    }
}
