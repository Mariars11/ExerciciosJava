package exercicioscap1.exercicioscap1;

import javax.swing.JOptionPane;

public class ExerciciosCap1 {

    public static void main(String[] args) {
          System.out.println("+-------------+");
        System.out.println("| Maria Clara |");
        System.out.println("+-------------+");     
        
        System.out.println("  /////");
        System.out.println(" | ° ° |");
        System.out.println("(|  ^  |)");
        System.out.println(" | [_] |");
        System.out.println("  -----");
        
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        
        System.out.println("            +---+");
        System.out.println("            |   |");
        System.out.println("        +---+---+");
        System.out.println("        |   |   |");
        System.out.println("    +---+---+---+");
        System.out.println("    |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
        
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        //resultado errado
        System.out.println(1/1+1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10);
        
        System.out.println(1.0+2.0+3.0+4.0+5.0+6.0+7.0+8.0+9.0+10.0);
        
        //abre janela com a mensagem
        JOptionPane.showMessageDialog(null, "Hello, Maria Clara!"); 
       
        
        //abre na janela o input e imprime no terminal
        String name = JOptionPane.showInputDialog("Qual seu nome? "); 
        System.out.println(name); 
        System.exit(0);
    }
}
