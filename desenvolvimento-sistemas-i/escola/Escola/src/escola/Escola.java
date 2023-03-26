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

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de alunos", "Quantidade de alunos", 1));
        int i = 0, op, j;
        String nomeAluno;
        boolean achou;

        Aluno al[] = new Aluno[n];

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada: \n1: Cadastrar \n2: Consultar \n3: Alterar \n4: Excluir \n5: Imprimir \n6: Sair\n", "Opção", 1));

            switch (op) {
                case 1:
                    for (i = 0; i < n; i++) {
                        al[i] = new Aluno();

                        al[i].setNome(JOptionPane.showInputDialog("Nome: "));
                        al[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matrícula: ")));
                        al[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                        al[i].setCurso(JOptionPane.showInputDialog("Curso: "));
                        al[i].setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Semestre: ")));
                    }

                    JOptionPane.showMessageDialog(null, "Cadastro concluído!");

                    break;

                case 2:
                    j = -1;
                    achou = false;

                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.\nSelecione a opção 1 para cadastrar.");
                    } else {
                        nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno que deseja consultar:");

                        for (i = 0; i < n; i++) {
                            String nomeIndice = al[i].getNome();

                            if (nomeIndice.equals(nomeAluno)) {
                                achou = true;
                                j = i;
                            }
                        }

                        if (achou == false) {
                            JOptionPane.showMessageDialog(null, "O aluno não foi encontrado no cadastro");
                        } else {
                            JOptionPane.showMessageDialog(null, al[j].imprimir());
                        }
                    }

                    break;

                case 3:
                    j = -1;
                    achou = false;

                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.\nSelecione a opção 1 para cadastrar.");
                    } else {
                        nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno que deseja alterar:");

                        for (i = 0; i < n; i++) {
                            String nomeIndice = al[i].getNome();

                            if (nomeIndice.equals(nomeAluno)) {
                                achou = true;
                                j = i;
                            }
                        }

                        if (achou == false) {
                            JOptionPane.showMessageDialog(null, "O aluno não foi encontrado no cadastro");
                        } else {
                            int altera = Integer.parseInt(JOptionPane.showInputDialog("Informe o item que deseja alterar: \n1: Nome \n2: Matrícula \n3: Idade \n4: Curso \n5: Semestre"));

                            switch (altera) {
                                case 1:
                                    al[j].setNome(JOptionPane.showInputDialog("Nome: "));
                                    break;
                                case 2:
                                    al[j].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matrícula: ")));
                                    break;
                                case 3:
                                    al[j].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                                    break;
                                case 4:
                                    al[j].setCurso(JOptionPane.showInputDialog("Curso: "));
                                    break;
                                case 5:
                                    al[j].setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Semestre: ")));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção selecionada inválida");
                            }

                            JOptionPane.showMessageDialog(null, "Alteração concluída!");
                        }
                    }

                    break;

                case 4:
                    j = -1;
                    achou = false;

                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.\nSelecione a opção 1 para cadastrar.");
                    } else {
                        nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno que deseja excluir:");

                        for (i = 0; i < n; i++) {
                            String nomeIndice = al[i].getNome();

                            if (nomeIndice.equals(nomeAluno)) {
                                achou = true;
                                j = i;
                            }
                        }

                        if (achou == false) {
                            JOptionPane.showMessageDialog(null, "O aluno não foi encontrado no cadastro");
                        } else {
                            for (i = j+1; i < n; i++) {
                                al[i-1].setNome(al[i].getNome());
                                al[i-1].setMatricula(al[i].getMatricula());
                                al[i-1].setIdade(al[i].getIdade());
                                al[i-1].setCurso(al[i].getCurso());
                                al[i-1].setSemestre(al[i].getSemestre());
                            }

                            al[n - 1].setNome(null);
                            al[n - 1].setMatricula(0);
                            al[n - 1].setIdade(0);
                            al[n - 1].setCurso(null);
                            al[n - 1].setSemestre(0);
                            
                            n -= 1;

                            JOptionPane.showMessageDialog(null, "Exclusão concluída");

                        }
                    }

                    break;

                case 5:
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.\nSelecione a opção 1 para cadastrar.");
                    } else {
                        String imprimirCadastro = "";

                        for (i = 0; i < n; i++) {
                            imprimirCadastro += al[i].imprimir();
                        }

                        JOptionPane.showMessageDialog(null, imprimirCadastro);
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção selecionada é inválida");
            }

        } while (op != 6);
    }

}
