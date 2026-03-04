package com.example.atv_complementares.atv3;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantEstoque;
    private Pedido pedido;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantEstoque() {
        return quantEstoque;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    public Pedido getPedido(){
        return pedido;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void vendido(int quantidade){
        if (this.quantEstoque>= quantidade){
            this.quantEstoque-=quantidade;
        }else{
            System.out.println("Estoque insuficiente para venda!");
        }
    }

}
