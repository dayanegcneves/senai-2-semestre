/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisaogeral;
import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class RevisaoGeral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        do{
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor", "Número", 1));
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão", "Operação", 1));
            int i, cont=0;
            String tabuada = "";

            for(i=1; i<=10; i++){
                switch (op) {
                    case 1:
                        tabuada = tabuada + (n + " + " + i + " = " + (n+i) + "\n");
                        break;
                    case 2:
                        tabuada = tabuada + ((n+i) + " - " + n + " = " + (n+i-n) + "\n");
                        break;
                    case 3:
                        tabuada = tabuada + (n + " x " + i + " = " + (n*i) + "\n");
                        break;
                    case 4:
                        tabuada = tabuada + ((n*i) + " / " + n + " = " + ((n*i) / n) + "\n");
                        break;
                    default:
                        cont = 1;
                }
            }
            if(cont == 1){
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
            else{
                JOptionPane.showMessageDialog(null, tabuada);
            }
            
            c = JOptionPane.showConfirmDialog(null, "Deseja exibir outra tabuada?", "Saída", JOptionPane.YES_NO_OPTION);
            
            if(c == 1){
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }            
            
        }while(c == 0);
    }
    
}
