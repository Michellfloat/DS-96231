package com.example.atv2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("João Silva", "1 2345-6789", "123.456.789-00", "MG1234567", "01/01/1990");
        Juridica juridica = new Juridica("Empresa X", "9 8765-4321", "12.345.678/0001-00", "12345678");
        
        System.out.println("Pessoa Física:");
        System.out.println(fisica.toString());
        System.out.println("\nPessoa Jurídica:");
        System.out.println(juridica.toString());
    }
}
