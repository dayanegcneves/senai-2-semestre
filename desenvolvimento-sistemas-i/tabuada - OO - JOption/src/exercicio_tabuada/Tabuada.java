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
    public String adicao(int num, int j){
        return num + " + " + j + " = " + (num+j) + "\n"; 
    }
    
    public String subtracao(int num, int j){
        return (num+j) + " - " + num + " = " + (num+j-num) + "\n"; 
    }
    
    public String multiplicacao(int num, int j){
        return num + " x " + j + " = " + (num*j) + "\n"; 
    }
    
    public String divisao(int num, int j){
        return (num*j) + " / " + num + " = " + ((num*j)/num) + "\n"; 
    }
}
