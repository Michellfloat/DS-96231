package com.example.complementar;

public class Main {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("Toyota", 12, 4);

        System.out.println(novoCarro.toString());
        novoCarro.abrirPorta_malas();
    }
}
