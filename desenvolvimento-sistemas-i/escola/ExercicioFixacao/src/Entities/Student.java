/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author daday
 */
public class Student {
    public String nome;
    public double av1, av2, av3;
    
    public double media(){
        return av1 + av2 + av3;
    }
    
    public void verificaMedia(){
        if(media() > 60.0){
            System.out.println("PASS");
        }
        else{
            System.out.printf("FAILED \nMISSING %.2f POINTS", (60 - media()));
        }
    }
}
