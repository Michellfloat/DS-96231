package com.example.atv3;

public class livro {
    private String titulo;
    private String autor;
    private int NúmeroDePaginas;
    private double preco;

    public livro(String titulo, String autor, int NúmeroDePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.NúmeroDePaginas = NúmeroDePaginas;
        this.preco = preco;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNúmeroDePaginas() {
        return NúmeroDePaginas;
    }

    public double getPreco() {
        return preco;
    }



}
