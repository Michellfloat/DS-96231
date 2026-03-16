package com.example.ex1;

public class Gato implements Animal{
    //Sobrescrita de método

    @Override
    public String emitirSom() {
        
        return "Miau!";
    }
    @Override
    public String comer() {
        return "Whiskers";
    }
}
