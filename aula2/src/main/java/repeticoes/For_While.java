package repeticoes;

import java.util.Scanner;

public class For_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = teclado.nextInt();

        while (idade<18){
            System.out.println("acesso negado!");
            System.out.println("Digite a sua idade:");
            idade = teclado.nextInt();
        }
        System.out.println("Acesso permitido!");
        System.out.println("Carregando...");
    }
}
