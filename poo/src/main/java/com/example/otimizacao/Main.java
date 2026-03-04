package com.example.otimizacao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", Pedido.ABERTO);

        System.out.println(cliente1.toString());
    }
}