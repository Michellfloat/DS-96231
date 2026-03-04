package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        //instanciando a classe Professor
        Professor professor1 = new Professor("João","joao@professor.com","Matemática");
        System.out.println("Professor: "+professor1.getNome());
        
        Professor professor2 = new Professor("Maria","Maria.s@gmail.com","História");
        System.out.println("Professor: "+professor2.getNome());
        System.out.println("Matéria: "+professor2.getMateria());

    }
}
