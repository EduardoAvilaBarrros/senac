import java.util.Random;
import java.util.Scanner;

public class Ife {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fome;
        int dinheiro;
        System.out.println("Está com fome?" +
                "\n1- Sim" +
                "\n2- Nao");
        fome = entrada.nextInt();
        System.out.println("Está tem dinheiro?" +
                "\n1- Sim" +
                "\n2- Nao");
        dinheiro = entrada.nextInt();
        if (fome == 1 && dinheiro == 1){
            System.out.println("Vá para a cantina");
        } else if (fome == 1 && dinheiro == 2) {
            System.out.println("Trabalhar que é bom nada!");
        } else if (fome == 2 && dinheiro == 1) {
            System.out.println("Guarde o dinheiro");
        } else if (fome == 2 && dinheiro == 2) {
            System.out.println("Vá procurar algo para fazer!");
        }else {
            System.out.println("Invalido!");
        }
    }
}
