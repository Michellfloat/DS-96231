package repeticoes2;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int avaliacao = teclado.nextInt();

        do {
            System.out.println("Avalie o nosso atendimento, de 1 a 5 estrelas:");

        }while (avaliacao<1 || avaliacao>5);
        System.out.println("Obrigado!!");
    }
}