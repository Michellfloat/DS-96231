package com.example.atv_complementares.atv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);
    ArrayList<String> listaDeProdutos = new ArrayList<>();

    //Produto 1
    Produto produto1 = new Produto();
    produto1.setNome("Espada");
    produto1.setPreco(375.87);
    produto1.setQuantEstoque(67);

    //Produto 2
    Produto produto2 = new Produto();
    produto2.setNome("Machado");
    produto2.setPreco(650.35);
    produto2.setQuantEstoque(12);

    //Produto 3
    Produto produto3 = new Produto();
    produto3.setNome("Arco");
    produto3.setPreco(525.50);
    produto3.setQuantEstoque(0);

    //Adicionando os produtos na Array:
    listaDeProdutos.add(produto1.getNome());
    listaDeProdutos.add(produto2.getNome());
    listaDeProdutos.add(produto3.getNome());

    

    System.out.println("Lojas AMADO!!");
    System.out.println("Digite o produto que deseja comprar:");
    System.out.println("1-Espada->Quantidade atual:"+produto1.getQuantEstoque());
    System.out.println("2-Machado->Quantidade atual:"+produto2.getQuantEstoque());
    System.out.println("3-Arco->Quantidade atual:"+produto3.getQuantEstoque());
    System.out.println("\nDigite a sua opção aqui:");

    int qProduto = teclado.nextInt();

        produto1.pedidoFeito(qProduto);
    teclado.close();
    System.out.println(listaDeProdutos);
    }
    
    
}

