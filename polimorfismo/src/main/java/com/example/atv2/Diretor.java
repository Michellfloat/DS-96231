package com.example.atv2;

public class Diretor extends Funcionario implements Contratacao{

    private final double premio = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        super(nome, dataNascimento, sexo, setor, salario);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você foi contratado!\nBem vindo a empresa "+funcionario.getNome());
        
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você foi demitido.\nSentimos muito "+funcionario.getNome());
        
    }

    @Override
    public double salarioFinal() {
        double salarioFinal = super.salario+(super.salario*this.premio);

        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", premio=" + premio + ", sexo=" + sexo.getTexto()
                + ", setor=" + setor.getTexto() + ", salario=" + salario + ", salarioFinal()=" + salarioFinal() + "]";
    }

    
    
    
}
