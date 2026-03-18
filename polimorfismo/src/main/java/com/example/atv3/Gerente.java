package com.example.atv3;

public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Olá,você foi admitido!\nSeja bem vindo Sr(a). "+funcionario.getNome());
        
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você foi demitido\nSentimos muito Sr(a). "+funcionario.getNome());
        
    }

    @Override
    public double obterSalarioFinal() {
        
        return Bonificacao.GERENTE.getValor() * super.salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente [bonificacao=" + bonificacao + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", salarioBase=" + salarioBase + ", obterSalarioFinal()=" + obterSalarioFinal() + "]";
    }

    
    
    
    
}
