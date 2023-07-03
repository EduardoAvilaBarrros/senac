import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;
        String nome;

        System.out.print("Entre com seu nome: \n");
        nome = ler.next();
        System.out.printf("Seu nome e : %s \n", nome);

        System.out.print("Entre com sua idade: \n" );
        idade = ler.nextInt();
        System.out.printf("Sua idade e %d: \n", idade);

    }

}
