package com.example.atv2;

public class Empresa {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Mirai");
        func.setCargo("Coordenador Pleno de TI");
        func.setSalario(9000);

        System.out.println("Bom dia Sr." + func.getNome() +", Cargo:" + func.getCargo() + ", \nVocê recebe muito bem, R$" + func.getSalario() +",\nMe da um terço disso pfv");
    }
}
