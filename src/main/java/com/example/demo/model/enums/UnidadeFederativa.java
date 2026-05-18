package com.example.demo.model.enums;

public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de janeiro");

    private String unidade;

    private UnidadeFederativa(String unidade){
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    
}
