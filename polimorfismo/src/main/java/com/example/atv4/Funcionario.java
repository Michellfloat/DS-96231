package com.example.atv4;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected String dataNas;
    protected String dataAdmissao;
    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNas,
            String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
        this.dataNas = dataNas;
        this.dataAdmissao = dataAdmissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getDataNas() {
        return dataNas;
    }
    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    @Override
    public double getSalarioFinal() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
