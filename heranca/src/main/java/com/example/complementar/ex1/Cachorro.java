package com.example.complementar.ex1;

public class Cachorro extends Animal{
    
    private String nome;
    private String raca;
    private String alimentacao;

    
    
    public Cachorro(String nome, String raca, String alimentacao) {
        this.nome = nome;
        this.raca = raca;
        this.alimentacao = alimentacao;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getRaca() {
        return raca;
    }



    public void setRaca(String raca) {
        this.raca = raca;
    }



    public String getAlimentacao() {
        return alimentacao;
    }



    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }



    public void latir(){
        System.out.println("Au au!");
    }



    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", raca=" + raca + ", alimentacao=" + alimentacao + "]";
    }
    
    

}
