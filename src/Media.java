import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double numero;
        double soma = 0.0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Entre com um numero:");
            numero = ler.nextDouble();
            soma = soma + numero;
        }
        System.out.println(soma/5);
    }
}
