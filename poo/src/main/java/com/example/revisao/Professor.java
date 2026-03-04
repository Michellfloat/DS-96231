package com.example.revisao;

public class Professor {
    //atributos
    private String nome;
    private String email;
    private String materia;

    //construtor
    public Professor(String nome, String email, String materia) {
        this.nome = nome;
        this.email = email;
        this.materia = materia;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getMateria() {
        return materia;
    }
    
}
