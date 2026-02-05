package exercicio4;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Os pares de 100-120:");
        for (int i =100; i<=120; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
