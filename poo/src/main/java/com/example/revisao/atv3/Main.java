package com.example.revisao.atv3;

public class Main {
    public static void main(String[] args) {
        //instanciando a classe ContaBancaria dentro da classe Funcionario
        Funcionario funcionario1 = new Funcionario("12345", "Marcos", "Rua Xile", "1234-5678", "marcos@gmail.com", new ContaBancaria("banco do brasil", "agencia 123", "12345-6", "corrente-salário", 1000.00, 500.00));

        Funcionario funcionario2 = new Funcionario("4567", "Mirai", "Rua Estrela do Céus", "4564-7167", "mirai@gmail.com", new ContaBancaria("Banco do Brasil", "agencia 456", "45678-9", "corrente-salário", 2000.00, 1000.00));
        
        
        System.out.println("Bom dia Funcionario: "+funcionario1.getNome()+"Você atualmente trabalha no banco: "+funcionario1.getContaBancaria().getBanco()+"\nSua conta é do tipo: "+funcionario1.getContaBancaria().getTipoConta()+"\nSeu saldo é de: R$"+funcionario1.getContaBancaria().getSaldoAtual()+" e seu limite disponível é de: R$"+funcionario1.getContaBancaria().getLimiteDisponivel());

        System.out.println("\nBom dia Funcionario: "+funcionario2.getNome()+"Você atualmente trabalha no banco: "+funcionario2.getContaBancaria().getBanco()+"\nSua conta é do tipo: "+funcionario2.getContaBancaria().getTipoConta()+"\nSeu saldo é de: R$"+funcionario2.getContaBancaria().getSaldoAtual()+" e seu limite disponível é de: R$"+funcionario2.getContaBancaria().getLimiteDisponivel());


    }
}
