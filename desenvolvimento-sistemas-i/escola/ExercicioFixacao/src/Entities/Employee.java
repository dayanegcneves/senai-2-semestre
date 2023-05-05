/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author daday
 */
public class Employee {
    public String name;
    public double grossSalary, tax, salary;
    
    public double netSalary(){
        salary = grossSalary - tax;
        return salary;
    }
    
    public void increaseSalary(double percentage){
        salary = netSalary() + (grossSalary * (percentage/100));
    }
}
