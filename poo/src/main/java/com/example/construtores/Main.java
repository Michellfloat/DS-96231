package com.example.construtores;

public class Main {
public static void main(String[] args) {
    //Construtor pessoa1 = new Construtor("Clarisse", 18);
    //System.out.println("Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());

    // instanciando a classe Aluno
    Aluno aluno1 = new Aluno("Mirai", 17, "mirai@email.com");
    System.out.println("Seu nome: " + aluno1.getNome() + ",\n Sua idade: " + aluno1.getIdade() + ",\nSeu email: " + aluno1.getEmail());
}
}
