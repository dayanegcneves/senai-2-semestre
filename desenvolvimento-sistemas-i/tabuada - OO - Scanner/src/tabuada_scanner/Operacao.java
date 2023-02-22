/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuada_scanner;

/**
 *
 * @author daday
 */
public class Operacao {
    public void menu(int opcao, int numero){
        Calculo tabuada = new Calculo();
        
        int i, num;
        String resultado = "";
                
        for(i=1; i<=10; i++){
            if(opcao == 1){
                resultado += tabuada.adicao(numero, i);
            }
            else if(opcao == 2){
                resultado += tabuada.subtracao(numero, i);
            }
            else if(opcao == 3){
                resultado += tabuada.multiplicao(numero, i);
            }
            else{
                resultado += tabuada.divisao(numero, i);
            }
        }
        System.out.println("\nTABUADA:\n" + resultado + "\n");
    }
}
