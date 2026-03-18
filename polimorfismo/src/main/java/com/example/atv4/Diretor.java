package com.example.atv4;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double premio = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNas,
            String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNas, dataAdmissao, bonificacao);
    }

    public double getPremio() {
        return premio;
    }

    @Override
    public double getSalarioFinal() {
        double salarioDiretor = Bonificacao.DIRETOR.getValor() * super.salarioBase;
        double salarioFinal = salarioDiretor + (salarioDiretor*premio);
        return salarioFinal;
        
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
    public String toString() {
        return "Diretor [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", salarioBase=" + salarioBase + ", dataNas=" + dataNas + ", dataAdmissao=" + dataAdmissao + ", bonificacao=" + bonificacao + ", premio=" + premio + ", salarioFinal()=" + getSalarioFinal() + "]";
    }


}
