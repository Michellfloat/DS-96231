package com.example.demo.model.enums;

public enum CategoriaProduto {
    LIMPEZA("Limpeza"),
    ALIMENTACAO("Alimentação"),
    BELEZA("Beleza"),
    ELETRONICOS("Eletrônicos"),
    ROUPAS("Roupas"),
    OUTROS("Outros");

    private String categoria;
    
    private CategoriaProduto(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria; 
    }
}
