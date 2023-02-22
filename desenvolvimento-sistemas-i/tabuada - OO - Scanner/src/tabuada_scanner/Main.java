/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada_scanner;
import java.util.Scanner;
/**
 *
 * @author daday
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int continua;
        
        do{
            int op, n;
            Scanner leia = new Scanner(System.in);
            Operacao calcular = new Operacao();

            do{
                System.out.println("MENU -> SELECIONE A OPERAÇÃO DESEJADA: \n" +
                                "1 - Adição \n" +
                                "2 - Subtração \n" +
                                "3 - Multiplicação \n" +
                                "4 - Divisão \n");

                op = leia.nextInt();
            }while(op<=0 || op>4);

            System.out.println("Informe o número: ");
            n = leia.nextInt();
            calcular.menu(op, n);
            
            System.out.println("Deseja exibir outra tabuada? \n1 - SIM \t2 - NÃO");
            continua = leia.nextInt();
            
            if(continua == 2){
                System.out.println("\n\nPROGRAMA FINALIZADO\n\n");
            }
            
        }while(continua == 1);
    }
    
}
