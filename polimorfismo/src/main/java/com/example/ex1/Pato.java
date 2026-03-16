package com.example.ex1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Quack Quack!!";
    }
    @Override
    public String comer() {
        return "Pão com banana";
    }
}
