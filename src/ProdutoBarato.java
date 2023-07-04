import java.util.Scanner;

public class ProdutoBarato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String produto1;
        String produto2;
        String produto3;
        double preco1;
        double preco2;
        double preco3;
        System.out.println("Entre com o primeiro produto e com seu preco");
        produto1 = entrada.next();
        preco1 = entrada.nextDouble();
        System.out.println("Entre com o segundo produto e com seu preco");
        produto2 = entrada.next();
        preco2 = entrada.nextDouble();
        System.out.println("Entre com o terceiro produto e com seu preco");
        produto3 = entrada.next();
        preco3 = entrada.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O primeiro produto tem o menor preco");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O segundo produto tem o menor preco");
        } else if (preco3 < preco2 && preco3 < preco1) {
            System.out.println("O terceiro produto tem o menor preco");
        } else {
            System.out.println("Invalido");
        }
    }
}
