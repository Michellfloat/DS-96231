package com.example.atv_complementares.atv2;

public class Contabancaria {
    private String titular;
    private double saldo;
    private String numConta;

    //Construtor da Classe "Contabacaria"
    public Contabancaria(String titular, double saldo, String numConta){
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }


    //Gets
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getnumConta(){
        return numConta;
    }

    //métodos para sacar e depositar:

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;

            System.out.println("Foram depositados:R$"+ valor+ " da sua conta,\nSeu saldo atual é:R$"+ saldo);
        }else{
            System.out.println("Valor de depósito inválido!");
        }
    } 
    
    public void sacar(double valor){
        if (valor > 0 && this.saldo >= valor){

            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!\nVocê fez um saque de:R$" + valor + "\nE seu saldo atual é de:R$" + saldo);
        }else{
            System.out.println("Saque indisponível!\nValor do saque é maior do que o saldo da sua conta!");
        }
    }
}
