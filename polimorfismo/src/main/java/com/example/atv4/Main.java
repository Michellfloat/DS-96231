package com.example.atv4;

public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("João", "123.456.789-00", "MG-12.345.678", Sexo.MASCULINO, 5000.0, "01/01/1980", "01/01/2010", Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Maria", "987.654.321-00", "SP-87.654.321", Sexo.FEMININO, 8000.0, "02/02/1975", "02/02/2005", Bonificacao.DIRETOR);
        Motoboy motoboy = new Motoboy("Carlos", "111.222.333-44", "RJ-11.222.333", Sexo.MASCULINO, 2000.0, "03/03/1990", "03/03/2015", "ABC-1234");
        
        System.out.println(diretor.toString()+"\n");
        System.out.println(gerente.toString()+"\n");
        System.out.println(motoboy.toString()+"\n");

        diretor.admitir(motoboy);
        diretor.demitir(motoboy);
    }
}
