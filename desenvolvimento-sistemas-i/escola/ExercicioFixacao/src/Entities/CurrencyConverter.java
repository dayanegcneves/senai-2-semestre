/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author daday
 */
public class CurrencyConverter {
    
    public static double precoDolar, valorCompra;
    
    public static double cotacaoDolar(){
        return precoDolar * valorCompra;
    }
    
    public static double valorPago(){
        return (cotacaoDolar() + (precoDolar * valorCompra * 0.06));
    }
    
}
