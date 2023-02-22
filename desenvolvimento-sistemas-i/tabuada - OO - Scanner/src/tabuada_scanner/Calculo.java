/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuada_scanner;

/**
 *
 * @author daday
 */
public class Calculo {
    public String adicao(int num, int j){
        return num + " + " + j + " = " + (num+j) + "\n";
    }
    
    public String subtracao(int num, int j){
        return (num+j) + " - " + num + " = " + (num+j-num) + "\n";
    }
    
    public String multiplicao(int num, int j){
        return num + " x " + j + " = " + (num*j) + "\n";
    }
    
    public String divisao(int num, int j){
        return (num*j) + " / " + j + " = " + ((num*j)/num) + "\n";
    }
}
