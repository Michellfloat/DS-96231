package com.example.complementar.atv2;

public class Retangulo implements Figura{

    @Override
    public float calcularArea(int base, int altura) {
        System.out.println("A sua forma escolhida foi o Retângulo.");
        int formaret = base * altura; 
        System.out.println("O seu retângulo possui:"+formaret+"m²");
        return formaret;
    }

    
}
