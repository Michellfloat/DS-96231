package com.example.atv3;

public class Motoboy extends Funcionario{
    private String placaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy [placaMoto=" + placaMoto + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", salarioBase=" + salarioBase + ", getPlacaMoto()=" + getPlacaMoto()
                + ", obterSalarioFinal()=" + obterSalarioFinal() + "]";
    }

    
}
