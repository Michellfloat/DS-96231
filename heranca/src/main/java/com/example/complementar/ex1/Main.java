package com.example.complementar.ex1;

public class Main {
    public static void main(String[] args) {
        Cachorro toto = new Cachorro("totó","Chevrolet", "Pedigri");

        toto.latir();
        System.out.println("Olá:"+ toto.getNome() + "\nHora de comer seu:"+toto.getAlimentacao());

        toto.comer();
    }
}
