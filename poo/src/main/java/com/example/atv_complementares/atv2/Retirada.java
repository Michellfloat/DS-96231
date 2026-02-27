package com.example.atv_complementares.atv2;

import java.util.Scanner;

public class Retirada {
    public static void main(String[] args) {
        //Criando o leitor de 'input' do usuário
        Scanner teclado = new Scanner(System.in);

        //Criando a conta bancária
        Contabancaria conta1 = new Contabancaria("Michell Silva", 11700.85, "1234-5");

        System.out.println("Bem vindo Sr(a). " + conta1.getTitular());
        System.out.println("Seu saldo atual é de:R$" +  conta1.getSaldo());

        System.out.println("Digite o quanto deseja sacar Sr(a). " + conta1.getTitular()+":");
        
        double valorSaque = teclado.nextDouble();

        conta1.sacar(valorSaque);


        System.out.println("Saldo final:R$" + conta1.getSaldo());

        teclado.close();
    }
    
}
