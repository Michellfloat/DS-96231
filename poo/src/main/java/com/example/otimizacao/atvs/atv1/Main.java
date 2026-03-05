package com.example.otimizacao.atvs.atv1;

public class Main {
    public static void main(String[] args) {
     Funcionario funcionario1 = new Funcionario("01", "Marcos", 1500.75, Setor.VENDAS, Sexo.MASCULINO, 18);
     Funcionario funcionario2 = new Funcionario("03", "Maria", 2700, Setor.RECURSOS_HUMANOS, Sexo.FEMININO, 25);
     Funcionario funcionario3 = new Funcionario("02", "Joelma", 5000, Setor.FINANCEIRO, Sexo.FEMININO, 27);
     Funcionario funcionario4 = new Funcionario("04", "João", 3500, Setor.MARKETING, Sexo.MASCULINO, 30);
     Funcionario funcionario5 = new Funcionario("05", "Ana", 4000, Setor.VENDAS, Sexo.FEMININO, 22);
     
     System.out.println("Bem vindo a empresa, " + funcionario1.getNome() + "!"+"\nVocê é do setor de "+funcionario1.getSetor()+"\nRecebe um salário de R$"+funcionario1.getSalario()+" e tem "+funcionario1.getIdade()+" anos.\n");
     System.out.println("Bem vindo a empresa, " + funcionario2.getNome() + "!"+"\nVocê é do setor de "+funcionario2.getSetor()+"\nRecebe um salário de R$"+funcionario2.getSalario()+" e tem "+funcionario2.getIdade()+" anos.\n");
     System.out.println("Bem vindo a empresa, " + funcionario3.getNome() + "!"+"\nVocê é do setor de "+funcionario3.getSetor()+"\nRecebe um salário de R$"+funcionario3.getSalario()+" e tem "+funcionario3.getIdade()+" anos.\n");
     System.out.println("Bem vindo a empresa, " + funcionario4.getNome() + "!"+"\nVocê é do setor de "+funcionario4.getSetor()+"\nRecebe um salário de R$"+funcionario4.getSalario()+" e tem "+funcionario4.getIdade()+" anos.\n");
     System.out.println("Bem vindo a empresa, " + funcionario5.getNome() + "!"+"\nVocê é do setor de "+funcionario5.getSetor()+"\nRecebe um salário de R$"+funcionario5.getSalario()+" e tem "+funcionario5.getIdade()+" anos.\n");
    }
}
