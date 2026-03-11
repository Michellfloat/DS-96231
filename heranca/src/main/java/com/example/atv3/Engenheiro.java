package com.example.atv3;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String email, float salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro [nome=" + nome + "\n crea=" + crea + "\n email=" + email + "\n salario=" + salario
                + "\n endereco=" + endereco + "]";
    }

    
}
