import java.util.Scanner;

public class DoisValores {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valorUm;
        int valorDois;

        System.out.print("Entre com o valor um:");
        valorUm = ler.nextInt();
        System.out.print("Entre com o valor Dois:");
        valorDois = ler.nextInt();

        if (valorUm > valorDois){
            System.out.print("O valor um e maior que o valor dois \n" + valorUm);
        } else {
            System.out.print("O valor dois e maior que o valor um \n" + valorDois);
        }

    }
}
