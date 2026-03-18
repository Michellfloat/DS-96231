package com.example.atv4;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNas,
            String dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, sexo, salarioBase, dataNas, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy [nome=" + nome + ", placaDaMoto=" + placaDaMoto + ", cpf=" + cpf + ", rg=" + rg + ", sexo="
                + sexo + ", salarioBase=" + salarioBase + ", dataNas=" + dataNas + ", dataAdmissao=" + dataAdmissao
                + ", salarioFinal()=" + getSalarioFinal() + "]";
    }

    @Override
    public double getSalarioFinal() {
        
        return super.salarioBase;
    }
    
    
}
