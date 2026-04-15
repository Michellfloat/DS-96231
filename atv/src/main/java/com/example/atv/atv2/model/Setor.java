package com.example.atv.atv2.model;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String setor;

    private Setor(String setor){
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    
}
