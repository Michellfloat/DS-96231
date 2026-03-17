package com.example.complementar.atv2;

public class Triangulo implements Figura{

    @Override
    public float calcularArea(int base, int altura) {
        System.out.println("A forma escolhida foi o Triângulo!");
        int formatri = (base * altura)/2;
        System.out.println("O seu triângulo tem:"+formatri+"m²");

        return formatri;
    }

    
}
