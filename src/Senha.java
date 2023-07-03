import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double senha;

        System.out.print("Entre com a senha:");
        senha = ler.nextDouble();

        if (senha == 1234) {
            System.out.print("ACESSO PERMITIDO");
        }else {
            System.out.print("ACESSO NEGADO");
        }

    }


}
