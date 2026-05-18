package com.example.demo.model.enums;

public enum Cargo {
    ESTAGIARIO("Estagiário"),
    ANALISTA("Analista"),
    GERENTE("Gerente"),
    DIRETOR("Diretor"),
    CEO("CEO");

    private String cargo;
    private Cargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    
}
