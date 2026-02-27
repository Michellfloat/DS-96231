package com.example.atv_complementares.atv1;

import java.util.Scanner;

public class Teste_Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        
        System.out.println("Olá usuário, gostaria de conhecer você!!\nPrimeiramente,digite o seu 1° nome:");

        String nome = teclado.next();

        pessoa.setPessoa(nome);

        System.out.println("Agora,digite a sua idade:");

        int idade = teclado.nextInt();

        pessoa.setIdade(idade);

        if (idade<0){
         System.out.println("Por favor inserir uma idade positiva!");
        }else{
        System.out.println("Ok!\nSeja bem vindo usuário " + pessoa.getPessoa() +"!!\nVi que você tem "+ pessoa.getIdade() +" anos");

        if (idade<12) {
            System.out.println("Uma criançinha!!");
        }else{
            if (idade>=12 && idade<18) {
                System.out.println("Um jovem adolescente,prazer!!");
            }else{
                if(idade>=18 && idade<60){
                    System.out.println("Bem Adulto!\nMuito prazer!");
                }else{
                     System.out.println("Um idoso!\nTem alguma história legal para contar?");
                }
            }
        }
    }
    teclado.close();
}

}
