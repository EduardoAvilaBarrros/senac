import java.util.Scanner;

public class OperaçõesMatematicas {

    public static void main(String[] args) {

      Scanner ler = new Scanner(System.in);

      double valorUm;
      double valorDois;

      System.out.print("Entre com o valor um:");
      valorUm = ler.nextDouble();

      System.out.print("Entre com o valor dois:");
      valorDois = ler.nextDouble();

      System.out.println("A soma dos dois valores é:" +(valorUm + valorDois));

      System.out.println("A subtração dos dois valores é:" +(valorUm - valorDois));

      System.out.println("A divisão dos dois valores é:" +(valorUm /valorDois));

      System.out.println("A multiplicação dos dois valores é:" +(valorUm * valorDois));

    }

}
