package com.example.atv2;

public class Empresa {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Mirai", "01/04/2026", Sexo.MASCULINO, Setor.FINANCEIRO, 20000.0);
        Diretor diretor2 = new Diretor("Ray", "15/08/1990", Sexo.FEMININO, Setor.RECURSOS_HUMANOS, 12000.0);
        Motoboy motoboy1 = new Motoboy("Carlos", "10/12/1995", Sexo.MASCULINO, Setor.OPERACOES, 3000.0, "AB");
        Motoboy motoboy2 = new Motoboy("Maria", "20/06/1998", Sexo.FEMININO, Setor.OPERACOES, 3000.0, "AC");
        
        System.out.println("Bom dia diretor "+diretor1.getNome()+", seu setor é "+diretor1.getSetor().getTexto()+" e seu salário final é R$"+diretor1.salarioFinal());
        System.out.println("Bom dia diretor "+diretor2.getNome()+", seu setor é "+diretor2.getSetor().getTexto()+" e seu salário final é R$"+diretor2.salarioFinal());
        System.out.println("Bom dia motoboy "+motoboy1.getNome()+", seu setor é "+motoboy1.getSetor().getTexto()+" e seu salário final é R$"+motoboy1.salarioFinal());
        System.out.println("Bom dia motoboy "+motoboy2.getNome()+", seu setor é "+motoboy2.getSetor().getTexto()+" e seu salário final é R$"+motoboy2.salarioFinal());

        System.out.println(diretor1.toString());
        System.out.println(diretor2.toString());
        System.out.println(motoboy1.toString());
        System.out.println(motoboy2.toString());

        diretor1.admitir(motoboy1);
        diretor1.demitir(motoboy2);


    }
}