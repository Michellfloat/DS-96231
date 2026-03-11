package com.example.atv2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("João Silva", "123456789", "12345678900", "MG1234567", "01/01/1990");
        Juridica juridica = new Juridica("Empresa X", "987654321", "12345678000100", "12345678");
        
        System.out.println("Pessoa Física:");
        System.out.println(fisica.toString());
        System.out.println("\nPessoa Jurídica:");
        System.out.println(juridica.toString());
    }
}
