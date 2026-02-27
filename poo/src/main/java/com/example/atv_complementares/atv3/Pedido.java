package com.example.atv_complementares.atv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);
    ArrayList<String> listaDeProdutos = new ArrayList<>();

    listaDeProdutos.add("espada");
    listaDeProdutos.add("")

    Produto produto = new Produto();

    System.out.println("Lojas AMADO!!");
    System.out.println("Digite o produto que deseja comprar:");
    System.out.println("1-espada->Quantidade atual:"+produto.getQuantEstoque());
    System.out.println("2-Machado->Quantidade atual:"+produto.getQuantEstoque());
    System.out.println("3-Arco->Quantidade atual:"+produto.getQuantEstoque());
    System.out.println("\nDigite a sua opção aqui:");

    int qProduto = teclado.nextInt();
    }
    
}

