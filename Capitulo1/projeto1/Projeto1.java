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
