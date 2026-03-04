package com.example.revisao.atv3;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDisponivel;

        //construtor
    public ContaBancaria(String banco, String agencia, String numeroConta, String tipoConta, double saldoAtual, double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    //getters
    public String getBanco() {
        return banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
    

}
