/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;
import javax.swing.JOptionPane;
/**
 *
 * @author daday
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando objeto pessoa1 tem a classe dadosPessoais
        DadosPessoais pessoa1 = new DadosPessoais();
        DadosProfissionais pessoa2 = new DadosProfissionais();
        
        //Objeto informará seus atributos
        JOptionPane.showMessageDialog(null, "Bem vindo ao menu de cadastro!");
        pessoa1.nome = JOptionPane.showInputDialog(null, "Informe seu nome", "Nome", 1);
        pessoa1.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome sua idade", "Idade", 1));
        pessoa1.cpf = JOptionPane.showInputDialog(null, "Infome seu CPF", "CPF", 1);
        pessoa1.endereco = JOptionPane.showInputDialog(null, "Informe seu endereço", "Endereço", 1);
        
        pessoa2.nomeEmpresa = JOptionPane.showInputDialog(null, "Informe o nome da empresa", "Empresa", 1);
        pessoa2.profissao = JOptionPane.showInputDialog(null, "Informe sua profissão", "Profissão", 1);
        pessoa2.carteiraTrabalho = JOptionPane.showInputDialog(null, "Infome o número da carteira de trabalho", "Carteira de Trabalho", 1);
        
        pessoa1.fichaDado();
        pessoa2.fichaProfissao();
    }
    
}
