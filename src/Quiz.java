import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        try {
            Integer pontos = 0;
            JOptionPane.showMessageDialog(null,
                    "Seja bem-vindo ao quiz do Senac!");
            String nomeJogador = JOptionPane.showInputDialog(
                    "Digite seu nome:");
            String quiz1 = JOptionPane.showInputDialog(
                    "1- O que significa SENAC?" +
                            "\nA- CENTRO PARA LOUCOS" +
                            "\nB- SERVIÇO AO CONSUMIDOR" +
                            "\nC- SENTRO DEDETIZADOR DE PRAGAS" +
                            "\nD- DIA DA PIZZA" +
                            "\nE- SERVIÇO NACIONAL DE APRENDIZAGEM COMERCIAL");
            if (quiz1.equals("E") || quiz1.equals("e")) {
                JOptionPane.showMessageDialog(null,
                        "ACERTOU MISERAVI! BOM DIMAIZI! " + nomeJogador);
                pontos = 1;
            } else if (quiz1 != null) {
                JOptionPane.showMessageDialog(null,
                        "ERROU PANGARÉ! " + nomeJogador);
            } else {
                JOptionPane.showMessageDialog(null,
                        "OPÇÃO INVÁLIDA! " + nomeJogador);
            }
            JOptionPane.showMessageDialog(null,
                    "Você acertou " + pontos + " perguntas!");
        } catch (NullPointerException e){
            System.out.println("DEU ERRO DE NPE");
        }
    }
}