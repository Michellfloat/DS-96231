package com.example.exemplo_1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 42, "2023-06-01", "Cartão de Crédito");
        Funcionario funcionario1 = new Funcionario("Maria", 30, "1234", "Gerente", 5000.00);

        System.out.println("Cliente:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Data de Cadastro: " + cliente1.getDataCompra());
        System.out.println("Tipo de Pagamento: " + cliente1.getFormaPagamento());
        System.out.println("\nFuncionário:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Matrícula: " + funcionario1.getMatricula());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());

    }
}