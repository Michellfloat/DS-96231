package com.example.complementar.atv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CartaoCredito cartao = new CartaoCredito();
        Boleto boleto = new Boleto();
        Pix pix = new Pix();

        System.out.println("===Local de Pagamento===");
        System.out.println("Digite aqui a opção de pagamento:");
        System.out.println("1-Cartão de Crédito\n2-Boleto\n3-Pix\nDigite aqui:");
        int op = teclado.nextInt();
        
        System.out.println("Digite aqui o quanto deseja pagar:");
        float valoraPagar = teclado.nextFloat();

        System.out.println("Digite aqui o valor possuínte na opção de pagamento:");
        float valorOpcao = teclado.nextFloat();
        if (op==1){
            cartao.processarPagamento(valoraPagar,valorOpcao);
        }else if (op==2) {
            boleto.processarPagamento(valoraPagar,valorOpcao);
        }else if (op==3) {
            pix.processarPagamento(valoraPagar, valorOpcao);
        }

    }
}
