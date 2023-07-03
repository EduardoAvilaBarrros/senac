import java.util.Scanner;

public class ReceberVariaveis {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int inteiro;
        double preco;
        String palavra;
        String frase;

//        System.out.print("Entre com um numero:\n");
//        inteiro = ler.nextInt();
//        System.out.printf("O numero digitado foi: %d \n",inteiro);

//        System.out.print("Entre com o valor de um produto");
//        preco = ler.nextDouble();
//        System.out.printf("O preco digitado foi de: %f", preco);

//        System.out.print("Entre com uma frase:\n");
//        palavra = ler.next();
//        System.out.printf("A palavra digitada foi: %s \n", palavra);

        System.out.print("Entre com uma frase:\n");
        frase = ler.nextLine();
        System.out.printf("A frase digitada foi: %s", frase);

    }


}
