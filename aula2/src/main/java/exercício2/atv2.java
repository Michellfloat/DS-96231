package exercício2;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        System.out.println("olá aluno!\nDigite o seu nome:");
//        String nome = teclado.next();
//
//        System.out.println("Agora,digite a sua 1° nota:");
//        double n1 = teclado.nextDouble();
//        System.out.println("Por fim,digite a sua 2° nota:");
//        double n2 = teclado.nextDouble();
//        double m =(n1+n2)/2;
//
//        if (m<7){
//            System.out.println(nome + ", você foi reprovado!");
//        }else{
//            System.out.println(nome + ", você foi aprovado!");
//        }
        System.out.println("Olá aluno do SENAI!\nDigite a sua 1° nota");
        double n1 = teclado.nextDouble();
        System.out.println("Agora, digite a sua 2° nota");
        double n2 = teclado.nextDouble();
        System.out.println("Por fim, digite a sua 3° nota");
        double n3 = teclado.nextDouble();
        double media = (n1+n2+n3)/3;
        if (media<5){
            System.out.println("Você foi reprovado!");

        }
        if (media>=5 && media<=6.9){
            System.out.println("Você passará por uma verificação suplementar!");
        }
        if (media>=7){
            System.out.println("Você foi Aprovado!\nParabéns!!");
        }
    }
}
