package com.example.atv3;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String email, float salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico [nome=" + nome + "\n crm=" + crm + "\n email=" + email + "\n salario=" + salario + "\n endereco="
                + endereco + "]";
    }

    
}
