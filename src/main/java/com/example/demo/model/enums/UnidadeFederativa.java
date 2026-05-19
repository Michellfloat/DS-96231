package com.example.demo.model.enums;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de janeiro", "RJ"),
    BA("BA", "BA");

    private String unidade;
    private String sigla;

    private UnidadeFederativa(String unidade, String sigla){
        this.unidade = unidade;
        this.sigla = sigla;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getSigla() {
        return sigla;
    }

    
}
