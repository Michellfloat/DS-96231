package exercicio3;

import java.util.Scanner;

public class Senai {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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
