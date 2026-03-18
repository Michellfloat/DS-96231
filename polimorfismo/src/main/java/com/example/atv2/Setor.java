package com.example.atv2;

public enum Setor {
    RECURSOS_HUMANOS("RH"), FINANCEIRO("FIN"), OPERACOES("OP");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}