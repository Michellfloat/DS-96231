package com.example.complementar.atv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
        Losango losango = new Losango();

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bom(boa) dia/tarde/noite!\nVamos fazer um cálculo de áreas...");

        System.out.println("Digite a área da figura:");
        int base = teclado.nextInt();

        System.out.println("Agora digite a altura da figura:");
        int altura = teclado.nextInt();

        System.out.println("Digite a opção de forma que deseja ver:");
        System.out.println("1-Retângulo\n2-Triângulo\n3-Losango(esse aqui está disponível no momento,mas ficará como opção)\nDigite aqui:");
        int op = teclado.nextInt();

        if (op==1){
            if (base==altura) {
                quadrado.calcularArea(base, altura);
            }else{
                retangulo.calcularArea(base, altura);
            }
        }else if (op==2) {
            triangulo.calcularArea(base, altura);
        }else if (op==3) {
            losango.calcularArea(base, altura);
        }
    teclado.close();
    }

}
