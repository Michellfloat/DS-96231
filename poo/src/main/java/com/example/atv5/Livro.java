package com.example.atv5;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;
    private double valorDaVenda;

    public Livro(String titulo, String autor, String isbn, int numeroDePaginas, double valorDaVenda) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDaVenda = valorDaVenda;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }
    
}
