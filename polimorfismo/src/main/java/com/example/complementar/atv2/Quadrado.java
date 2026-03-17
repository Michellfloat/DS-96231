package com.example.complementar.atv2;

public class Quadrado implements Figura{

    @Override
    public float calcularArea(int base, int altura) {
        System.out.println("A forma escolhida foi Quadrado(?)");
        System.out.println("Sim!\nAfinal a base e a altura são iguais!");
        int formaquad = base*base;
        System.out.println("O seu quadrado tem:"+formaquad+"m²");
        return formaquad;
    }

    
}
