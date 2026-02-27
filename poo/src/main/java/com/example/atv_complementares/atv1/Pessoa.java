package com.example.atv_complementares.atv1;

public class Pessoa {
    private String pessoa;
    private int idade;
    
    public String getPessoa(){
        return pessoa;
    }
    public int getIdade(){
        return idade;
    }

    public void setPessoa(String pessoa){
        
        this.pessoa = pessoa;

    }
    
    public void setIdade(int idade){
        this.idade = idade;
        if(this.idade<0){
            System.out.println("Por favor inserir uma idade positiva!");
        }else{
            System.out.println("Certo");
        }
    }
    
    
}
