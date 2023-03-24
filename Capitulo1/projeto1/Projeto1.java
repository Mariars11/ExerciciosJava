/*
    Projeto 1.1. Este projeto aprimora os Exercícios P1.7 e P1.8. Seu programa deve ler o nome do usuário e então mostrar uma seqüência de duas caixas de diálogo:
        • Primeiro, uma caixa de diálogo de entrada que pergunta: “O que você quer que eu faça?”
        • Então uma caixa de diálogo de mensagem que diz: “Sinto muito, (seu nome). Acho que não posso fazer isso.”

*/
package exercicioscap1.projeto1;

import javax.swing.JOptionPane;

public class Projeto1 {

    public static void main(String[] args) {
        //Uso de caixa de dialogos
        String name = JOptionPane.showInputDialog("Qual seu nome? "); 
        String decisao = JOptionPane.showInputDialog("O que você quê que eu faça? ");
        JOptionPane.showMessageDialog(null, "Sinto muito, " + name + ". Acho que não posso fazer isso."); 
        System.exit(0);
    }
}
