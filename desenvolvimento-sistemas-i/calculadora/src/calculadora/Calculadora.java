/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author daday
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op, continua;
        float n1, n2, resultado = 0;
        
        do{
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1º número", "1º número", 1));
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 2º número", "2º número", 1));
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a operação desejada: \n1: Adição \n2: Subtração \n3: Multiplicação \n4: Divisão", "Operação", 1));

            if(op == 4 && n1 == 0){
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por 0!");
            }
            else{
                switch (op) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        resultado = n1 / n2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção selecionada é inválida!");
                }

                JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
            }
            
            continua = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?" , "Finalizar programa", JOptionPane.YES_NO_OPTION);
            
            if(continua == 0){
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
            else{
                resultado = 0;
            }
            
        }while(continua == 1);
        
    }
    
}
