package com.example.revisao.atv1;

public class Main {
    public static void main(String[] args) {
        //instanciando a classe Endereco
        Endereco endereco1 = new Endereco("Rua A", "123", "São Paulo");
        //instanciando a classe Cliente
        Cliente cliente1 = new Cliente(endereco1, 45, "Ana");
        System.out.println("Cliente: "+cliente1.getNome());
        System.out.println("Cidade:"+cliente1.getEndereco().getCidade());
        
    }
}
