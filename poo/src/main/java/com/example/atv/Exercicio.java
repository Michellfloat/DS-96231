package com.example.atv;

public class Exercicio {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.setNome("Ascension");
        livro1.setPreco(45.75);

        System.out.println("O seu livro é:'" + livro1.getNome() +"'\nE o seu preço é:R$" + livro1.getPreco());    }
}
