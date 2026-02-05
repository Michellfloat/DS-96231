package Relacionais;

import java.util.Scanner;

public class If_e_Else {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite um número:");
//        int a = teclado.nextInt();
//        System.out.println("Digite o 2° número:");
//        int b = teclado.nextInt();
//        System.out.println("Digite 3° número:");
//        int c = teclado.nextInt();
//        if (a>b && a>c){
//            System.out.println("O maior é o primeiro!");
//        }
//        if (b>a && b>c){
//            System.out.println("O maior é o segundo!");
//        }
//        if (c>a && c>b){
//            System.out.println("O maior é o terceiro!");
//        }
//        else{
//            System.out.println("Erro!!");
//        }
        System.out.println("olá aluno!\nDigite o seu nome:");
        String nome = teclado.next();

        System.out.println("Agora,digite a sua 1° nota:");
        double n1 = teclado.nextDouble();
        System.out.println("Por fim,digite a sua 2° nota:");
        double n2 = teclado.nextDouble();
        double m =(n1+n2)/2;

        if (m<7){
            System.out.println("Reprovado!");
        }else{
            System.out.println("Aprovado!");
        }
    }
}
