package com.example.atv4;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNas,
            String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNas, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return Bonificacao.GERENTE.getValor() * super.salarioBase;
    
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", salarioBase=" + salarioBase + ", dataNas=" + dataNas + ", dataAdmissao=" + dataAdmissao + ", bonificacao=" + bonificacao + ", salarioFinal()=" + getSalarioFinal() + "]";  
    }
    
}
