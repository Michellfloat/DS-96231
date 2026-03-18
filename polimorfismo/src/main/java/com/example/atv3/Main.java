package com.example.atv3;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("João", "12345678900", "01/01/1980", 5000.00, Bonificacao.GERENTE);
        Motoboy motoboy1 = new Motoboy("Carlos", "98765432100", "15/05/1990", 2000.00, "ABC-1234");

        System.out.println("Gerente: " + gerente1.getNome() + ", Salário Final: R$" + gerente1.obterSalarioFinal());
        System.out.println("Motoboy: " + motoboy1.getNome() + ", Salário Final: R$" + motoboy1.obterSalarioFinal());

        System.out.println(gerente1.toString());
        System.out.println(motoboy1.toString());

        gerente1.admitir(motoboy1);
        gerente1.demitir(motoboy1);
    }
}
