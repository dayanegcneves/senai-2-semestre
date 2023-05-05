/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;
import Entities.CurrencyConverter;
import Entities.Employee;
import Entities.Rectangle;
import Entities.Student;
import com.oracle.webservices.internal.api.EnvelopeStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daday
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Rectangle retangulo = new Rectangle();
        
        System.out.println("Insira a largura");
        retangulo.width = sc.nextDouble();
        
        System.out.println("Insira a altura");
        retangulo.height = sc.nextDouble();
        
        System.out.println("AREA = " + retangulo.area() + "\nPERIMETER = " + retangulo.perimeter() + "\nDIAGONAL = " + retangulo.diagonal());
        
        
        Employee salario = new Employee();
        
        System.out.println("Name: ");
        salario.name = sc.nextLine();
        
        System.out.println("Gross salary: ");
        salario.grossSalary = sc.nextDouble();
        
        System.out.println("Tax: ");
        salario.tax = sc.nextDouble();
        
        System.out.printf("\nEmployee: %s, $ %.2f\n", salario.name, salario.netSalary());
        
        System.out.println("\nWhich percentage to increase salary?\n");
        double porcentagem = sc.nextDouble();
        salario.increaseSalary(porcentagem);
        
        System.out.printf("\nUpdated data: %s, $ %.2f\n", salario.name, salario.salary);

        
        
        Student estudante = new Student();
        
        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();
        
        System.out.print("AV1:");
        estudante.av1 = sc.nextDouble();
        
        System.out.print("AV2:");
        estudante.av2 = sc.nextDouble();
        
        System.out.print("AV3:");
        estudante.av3 = sc.nextDouble();
        
        System.out.printf("\nFINAL GRADE = %.2f\n", estudante.media());
        estudante.verificaMedia();
        System.out.println("");

        */
        
        System.out.print("What is the dollar price? ");
        CurrencyConverter.precoDolar = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.valorCompra = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.valorPago());
        System.out.println("");
    }
}
