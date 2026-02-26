package com.example.atv3;

public class Livraria {
    public static void main(String[] args) {
        livro livro1 = new livro("O mágico de Oz", "L. Frank Baum", 200, 29.90);
        livro livro2 = new livro("Ascension", "Michell Silva", 1800, 56.75);

        System.out.println("Título: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor() + "\nNúmero de Páginas: " + livro1.getNúmeroDePaginas() + "\nPreço: R$" + livro1.getPreco());
        System.out.println("Título: " + livro2.getTitulo() + "\nAutor: " + livro2.getAutor() + "\nNúmero de Páginas: " + livro2.getNúmeroDePaginas() + "\nPreço: R$" + livro2.getPreco());
        
    }
}
