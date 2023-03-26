/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class Aluno {

    String nome, curso;
    int idade, semestre, matricula;

    public Aluno(String nome, String curso, int idade, int semestre, int matricula) {
        super();
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.semestre = semestre;
        this.matricula = matricula;
    }

    public Aluno() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String imprimir() {
        return "Aluno "
                + "\nNome: " + nome
                + "\nMatricula: " + matricula
                + "\nIdade: " + idade
                + "\nCurso: " + curso
                + "\nSemestre: " + semestre
                + "\n\n";
    }
    
    
}
