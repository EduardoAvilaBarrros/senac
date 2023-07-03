import java.util.Scanner;

public class CincoPessoas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade = 0;
        
        for (int i= 1; i <= 5; i++ ){
            System.out.print("Entre com seu nome:");
            nome = ler.next();
            System.out.print( nome + "entre com sua idade:");
            idade = ler.nextInt();

            if (idade >= 18) {
                System.out.print(nome + "voce e maior de idade \n");
            }else {
                System.out.print(nome + "voce e menor de idade \n");
            }
        }

        
    }
}
