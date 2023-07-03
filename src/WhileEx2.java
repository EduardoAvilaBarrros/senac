import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double numero;
        double soma = 0.0;
        int i = 1;

        while (i <= 5){
            System.out.print("Entre com um numero:");
            numero = ler.nextDouble();
            soma = soma + numero;
            i++;

        }
        System.out.println(soma/5);
    }
}
