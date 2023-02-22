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
public class DadosProfissionais {
    String nomeEmpresa, profissao, carteiraTrabalho;
    
    public void fichaProfissao(){
        System.out.println("DADOS PROFISSIONAIS: \n\nNome da Empresa: " + nomeEmpresa + "\nProfissao: " + profissao + "\nCarteira de Trabalho: " + carteiraTrabalho + "\n");
    }
}
