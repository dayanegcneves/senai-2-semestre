/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;
import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Aluno a = new Aluno();
        
        a.setNome(JOptionPane.showInputDialog(null, "Nome", "Nome", 1));
        a.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Matrícula", "Matrícula", 1)));
        a.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade", "Idade", 1)));
        a.setCurso(JOptionPane.showInputDialog(null, "Curso", "Curso", 1));
        a.setSemestre(Integer.parseInt(JOptionPane.showInputDialog(null, "Semestre", "Semestre", 1)));
        */
        int i;
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos"));
        
        Aluno[] al = new Aluno[n];
        
        for(i=0; i<n; i++){
            al[i] = new Aluno();
            
            al[i].setNome(JOptionPane.showInputDialog("Nome"));
            al[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matrícula")));
            al[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
            al[i].setCurso(JOptionPane.showInputDialog("Curso"));
            al[i].setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Semestre")));
        }
        
        for(i=0; i<n; i++){
            al[i].imprimirCadastro();
        }
    }
    
}
