/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_tabuada;
import javax.swing.JOptionPane;
/**
 *
 * @author daday
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int continua;
        do{
            int op;
            Operacao escolha = new Operacao();

            do{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome a operação desejada: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão", "Operação", 1));
            }while(op<=0 || op>4);
            escolha.menu(op);
            
            continua = JOptionPane.showConfirmDialog(null, "Deseja exibir outra tabuada?", "Continua", JOptionPane.YES_NO_OPTION);
            
            if(continua == 1){
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
        }while(continua == 0);
    }
    
}
