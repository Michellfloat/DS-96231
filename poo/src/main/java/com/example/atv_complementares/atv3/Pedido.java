package com.example.atv_complementares.atv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

    //criando e adicionando itens em uma array vazia
    String[] listaDeProdutos = {"espada", "machado", "arco"};
    
    //Adicionando os elementos dos produtos

Produto produto1 = new Produto();
Produto produto2 = new Produto();
Produto produto3 = new Produto();


    //Adicionando os produtos
    produto1.setNome(listaDeProdutos[0]);
    produto1.setPreco(530.80);
    produto1.setQuantEstoque(12);

    produto2.setNome(listaDeProdutos[1]);
    produto2.setPreco(705.50);
    produto2.setQuantEstoque(5);

    produto3.setNome(listaDeProdutos[2]);
    produto3.setPreco(675.20);
    produto3.setQuantEstoque(0);
    
    //Hora de efetuar o pedido
    System.out.println("Lojas do Desastre");
    System.out.println("Digite o que deseja comprar:"+
    "\n1-"+produto1.getNome()+
    "\n2-"+produto2.getNome()+
    "\n3-"+produto3.getNome()+
    "\nDigite aqui:"
    );
    int produtoEscolhido = teclado.nextInt();

    System.out.println("Digite agora a quantidade que deseja comprar:");
    int quantComprada = teclado.nextInt();

    System.out.println("Agora,digite quanto deseja pagar:");
    double valorPagar = teclado.nextDouble();

    if (produtoEscolhido == 1){
        pedidoFeito(produto1, valorPagar, quantComprada);
    }
    else if (produtoEscolhido == 2) {
        pedidoFeito(produto2, valorPagar, quantComprada);
    }
    else if (produtoEscolhido == 3) {
        pedidoFeito(produto3, valorPagar, quantComprada);
    }
    else{
        System.out.println("Opção inválida, tente novamente");
    }



teclado.close();
    
    }
    public static void pedidoFeito(Produto produto, double pagar, int comprado){
        double valorPorProduto = produto.getPreco() * comprado;

        if (produto.getQuantEstoque()<=0){
            System.out.println("Produto esgotado!\nCompra não efetuada!");
        }
        else if(valorPorProduto>pagar){
            System.out.println("Valor insuficiente para pagar\nCompra não efetuada!");
        }else{
            produto.vendido(comprado);
            System.out.println("Compra efetuada com sucesso!");
            System.out.printf("\nVocê comprou "+comprado+" "+ produto.getNome()+ "(s) a R$"+String.format("%.2f", valorPorProduto)+".");
            
            double troco = pagar - valorPorProduto;
            System.out.printf("\nSeu troco é de:R$"+String.format("%.2f", troco));
            System.out.printf("\nQuantidade do estoque atual do item:"+ produto.getQuantEstoque());
        }
    }
}

