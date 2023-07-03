import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int anoNacimento;
        int anoAtual = 2023;
        int ano;

        System.out.print("Entre com seu ano de nascimento: \n");
        anoNacimento = ler.nextInt();

        ano = anoAtual - anoNacimento;

       if (ano >= 18) {
           System.out.print("Voce podera votar esse ano");
       }else {
           System.out.print("Voce nao podera votar esse ano");
       }
    }
}
