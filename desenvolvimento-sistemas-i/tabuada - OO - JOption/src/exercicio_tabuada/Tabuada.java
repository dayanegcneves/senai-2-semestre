/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_tabuada;

/**
 *
 * @author daday
 */
public class Tabuada {
    String resultado = "";
    
    public String adicao(int num, int j){
        resultado += num + " + " + j + " = " + (num+j) + "\n"; 
        return resultado;
    }
    
    public String subtracao(int num, int j){
        resultado += (num+j) + " - " + num + " = " + (num+j-num) + "\n"; 
        return resultado;
    }
    
    public String multiplicacao(int num, int j){
        resultado += num + " x " + j + " = " + (num*j) + "\n"; 
        return resultado;
    }
    
    public String divisao(int num, int j){
        resultado += (num*j) + " / " + num + " = " + ((num*j)/num) + "\n"; 
        return resultado;
    }
}
