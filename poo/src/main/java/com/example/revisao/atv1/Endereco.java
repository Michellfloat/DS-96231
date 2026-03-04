package com.example.revisao.atv1;

public class Endereco {
    private String logradouro;
    private String numero;
    private String cidade;

     //construtor
    public Endereco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;

    }
    //getters
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public String getCidade() {
        return cidade;
    }

}


