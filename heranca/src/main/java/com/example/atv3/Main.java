package com.example.atv3;
public class Main {
public static void main(String[] args) {
    
        Engenheiro engenheiro = new Engenheiro("João", "joao@example.com", 12345, new Endereco("Rua A", "123", "Apto 1", "12345-678", "Cidade X"), "CREA123");

        Medico medico = new Medico("Maria", "maria@example.com", 54321, new Endereco("Rua B", "456", "Apto 2", "98765-432", "Cidade Y"), "CRM987");

        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
    }
}
