/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromorevisao;
import javax.swing.JOptionPane;
/**
 *
 * @author daday
 */
public class PalindromoRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, fraseInvertida="";
        int continua;
        
        do{
            frase = JOptionPane.showInputDialog(null, "Informe a sentença", "Sentença", 1);
            frase = frase.replaceAll("\\s+", "");
            
            fraseInvertida = new StringBuilder(frase).reverse().toString();

            if(frase.equals(fraseInvertida)){
                JOptionPane.showMessageDialog(null, "Sentença invertida: " + fraseInvertida + "\nA sentença É um palíndromo");
            }
            else{
                JOptionPane.showMessageDialog(null, "Sentença invertida: " + fraseInvertida + "\nA sentença NÃO é um palíndromo");
            }
            
            continua = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Finalizar programa", JOptionPane.YES_NO_OPTION);
            if(continua == 0){
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
            else{
                fraseInvertida = "";
            }
            System.exit(0);
        }while(continua == 1);
        
    }
    
}
