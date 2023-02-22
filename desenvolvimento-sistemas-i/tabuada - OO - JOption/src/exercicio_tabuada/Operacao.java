/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_tabuada;

import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class Operacao {
    public void menu(int n){
        Tabuada calculo = new Tabuada();
        int i, numero;
        String tabuada = "";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número", "Número", 1));
        
        for(i=1; i<=10; i++){
            switch (n) {
                case 1:
                    tabuada += calculo.adicao(numero, i);
                    break;
                case 2:
                    tabuada += calculo.subtracao(numero, i);
                    break;
                case 3:
                    tabuada += calculo.multiplicacao(numero, i);
                    break;
                case 4:
                    tabuada += calculo.divisao(numero, i);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
        JOptionPane.showMessageDialog(null, tabuada);
    }
}
