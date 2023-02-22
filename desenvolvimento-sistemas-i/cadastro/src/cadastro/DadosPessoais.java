/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class DadosPessoais {
    String nome, endereco, cpf;
    int idade;
          
    public void fichaDado(){
        System.out.println("DADOS PESSOAIS: \n\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\n");
    }
}
