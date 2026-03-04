package com.example.atv_complementares.atv3;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantEstoque;
    
    
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

    //Método para comprar os itens
    public void pedidoFeito(double pagar){
        Scanner teclado = new Scanner(System.in);
        
        if (this.nome.equals("Espada")){
            if (this.quantEstoque>0){
            System.out.println("Digite o quanto deseja pagar(em R$):");
            pagar = teclado.nextDouble();
            if (this.preco>pagar){
                System.out.println("Não é possível fazer a compra!");
            }else{
                this.quantEstoque -= 1;
                System.out.println("Compra efetuada com sucesso!\nA quantidade no estoque do material atual é:"+this.quantEstoque);
            }
            }else{
                System.out.println("Desculpa,acabou o estoque do item no momento!");
            }

        }
        
    }

}
