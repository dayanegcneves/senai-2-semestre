/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author daday
 */
public class Rectangle {
    public double width, height;
    
    public double area(){
        return width * height;
    }
    
    public double perimeter(){
        return (width * 2) + (height * 2);
    }
    
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
