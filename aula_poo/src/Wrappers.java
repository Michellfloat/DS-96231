import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
//        String nomeUsuario = "Marta";
//        int senha = 123;
//
//        Boolean resultadoNome = nomeUsuario.equals("Marta");
//        Boolean resultadoSenha = (senha == 456);
//
//        System.out.println("O nome do usuário é:"+ resultadoNome + " correto?");
//        System.out.println("A senha do usuário é:" + resultadoSenha + " correto?");
//        // teremos um resultado "false" pois a senha não condiz com "resultadoSenha"
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o seu nome:");
//        String login = teclado.next();
//
//        System.out.println("Agora,digite a sua senha:");
//        int senha = teclado.nextInt();
//
//        String rLogin = "Michell";
//        Integer rSenha = 1945;
//        if (login.equals(rLogin) && senha == rSenha){
//            System.out.println("Bem vindo usuário '"+ login +"'!!!");
//        }else{
//            System.out.println("Erro!!\nNome ou senha inválidos,tente novamente!!!");

//        }
        String login = "Michell";
        int senha = 123;
        int dSenha;
        String dLogin;
        do{
            System.out.println("Digite o seu nome:");
        dLogin = teclado.next();

        System.out.println("Agora,digite a sua senha:");
        dSenha = teclado.nextInt();
        if((!login.equals(dLogin)) || senha != dSenha) {
            System.out.println("Senha ou usuário inválido, tente novamente!");
        }
        }while((!login.equals(dLogin)) || senha != dSenha);
        System.out.println("Bem vindo "+login+"!!");
        //Transformei um "ou" em "e",que horror cara!
    }

}
