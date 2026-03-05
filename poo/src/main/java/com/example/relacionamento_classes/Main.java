package com.example.relacionamento_classes;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Marta", 30, "11999999999", "marta@email.com", Sexo.FEMININO, new Endereco("Rua A", "123", "Apto 1", "12345-678", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Pessoa pessoa2 = new Pessoa(2, "João", 25, "11988888888", "joao@email.com", Sexo.MASCULINO, new Endereco("Rua B", "456", "Casa", "98765-432", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Pessoa pessoa3 = new Pessoa(3, "Ana", 28, "11977777777", "ana@email.com", Sexo.FEMININO, new Endereco("Rua C", "789", "Apartamento 2", "54321-876", "Brasília", UnidadeFederativa.BAHIA));

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}
