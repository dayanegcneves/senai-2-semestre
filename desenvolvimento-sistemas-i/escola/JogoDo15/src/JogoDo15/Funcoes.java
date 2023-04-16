/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDo15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class Funcoes {

    int nJogadas = 0;

    /**
     * Método responsável por mover o botão "bot1" para a próxima posição vazia
     * ("bot2" ou "bot3") na interface gráfica do jogo.
     *
     * bot1 botão que será movido bot2 botão que representa a posição ao lado do
     * "bot1" bot3 botão que representa a posição diagonal do "bot1"
     */
    public void mover(JButton bot1, JButton bot2, JButton bot3) {
        // Verifica se o botão 2 está vazio, caso esteja, move o botão 1 para essa posição.
        if (bot2.getText().equals("")) {
            bot2.setText(bot1.getText());
            bot1.setText("");
            nJogadas++; // Incrementa o número de jogadas realizadas.
        } // Caso contrário, verifica se o botão 3 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot3.getText().equals("")) {
            bot3.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        }
    }

    /**
     * Método responsável por mover o botão "bot1" para o próximo botão vazio
     * ("bot2", "bot3" ou "bot4") na interface gráfica do jogo.
     *
     * bot1 botão que será movido bot2 botão que representa a posição ao lado
     * esquerdo do "bot1" bot3 botão que representa a posição ao lado direito do
     * "bot1" bot4 botão que representa a posição (acima/abaixo) do "bot1"
     */
    public void mover(JButton bot1, JButton bot2, JButton bot3, JButton bot4) {
        // Verifica se o botão 2 está vazio, caso esteja, move o botão 1 para essa posição.
        if (bot2.getText().equals("")) {
            bot2.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        } // Caso contrário, verifica se o botão 3 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot3.getText().equals("")) {
            bot3.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        } // Caso contrário, verifica se o botão 4 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot4.getText().equals("")) {
            bot4.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        }
    }

    /**
     * Método responsável por mover o botão "bot1" para o próximo botão vazio
     * ("bot2", "bot3", "bot4" ou "bot5") na interface gráfica do jogo.
     *
     * bot1 botão que será movido bot2 botão que representa a posição ao lado
     * esquerdo do "bot1" bot3 botão que representa a posição ao lado direito do
     * "bot1" bot4 botão que representa a posição diagonal superior esquerda do
     * "bot1" bot5 botão que representa a posição diagonal superior direita do
     * "bot1"
     */
    public void mover(JButton bot1, JButton bot2, JButton bot3, JButton bot4, JButton bot5) {
        // Verifica se o botão 2 está vazio, caso esteja, move o botão 1 para essa posição.
        if (bot2.getText().equals("")) {
            bot2.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        } // Caso contrário, verifica se o botão 3 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot3.getText().equals("")) {
            bot3.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        } // Caso contrário, verifica se o botão 4 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot4.getText().equals("")) {
            bot4.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        } // Caso contrário, verifica se o botão 5 está vazio, caso esteja, move o botão 1 para essa posição.
        else if (bot5.getText().equals("")) {
            bot5.setText(bot1.getText());
            bot1.setText("");
            nJogadas++;
        }
    }

    /**
     * Método que soluciona o jogo, colocando os textos dos botões em ordem
     * numérica. Ele recebe um array de botões como parâmetro.
     */
    public void solucionar(JButton[] botoes) {
        // Array com os textos que devem aparecer nos botões em ordem numérica.
        String[] textosBotao = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};

        // Laço de repetição para percorrer o array de botões e setar os textos.
        for (int i = 0; i < botoes.length; i++) {
            botoes[i].setText(textosBotao[i]);
        }

        // Pergunta ao usuário se ele deseja jogar novamente.
        int jogarNovamente = JOptionPane.showConfirmDialog(null, "Jogo solucionado!\nDeseja jogar novamente?", "Jogar novamente", JOptionPane.YES_NO_OPTION);

        // Se o usuário escolher jogar novamente, chama o método "embaralhar" passando os mesmos botões.
/*        if (jogarNovamente == 0) {
            embaralhar(botoes);
        } // Caso contrário, exibe mensagem de agradecimento e encerra o programa.
        else {
            JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
            System.exit(0);
        }*/
    }

    /**
     * Método que verifica se a lista de valores está na ordem correta para
     * vencer o jogo.
     *
     * @param listaValores a lista de valores a ser verificada
     * @return true se a lista de valores está na ordem correta, false caso
     * contrário
     */
    public boolean vitoria(List<String> valores) {
        // Cria uma lista de valores corretos
        List<String> valoresCorretos = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15");

        // Retorna true se a lista de valores for igual à lista de valores corretos
        return valores.equals(valoresCorretos);
    }

    /**
     *
     * Método que verifica se a lista de botões passada corresponde à lista do
     * vetor2, e caso isso ocorra, exibe uma mensagem de vitória e pergunta se o
     * jogador deseja jogar novamente.
     *
     * b16 O botão que representa a última posição do jogo. botoes Uma lista de
     * botões representando o jogo.
     *
     * @return true caso o jogador tenha vencido e escolhido jogar novamente,
     * false caso contrário.
     */
    public boolean verificarVitoria(JButton b16, JButton... botoes) {
        // Criando um ArrayList de String para armazenar os valores dos botões
        List<String> valoresDosBotoes = new ArrayList<>();

        // Se o último botão (b16) estiver vazio, então é possivel que o jogo foi concluído
        if (b16.getText().equals("")) {
            // Adiciona os valores dos botões na lista
            for (int i = 0; i < botoes.length; i++) {
                JButton botao = botoes[i];
                valoresDosBotoes.add(botao.getText());
            }

            // Se a lista de valores dos botões corresponder à lista do vetor2, então o jogador venceu
            if (vitoria(valoresDosBotoes)) {
                // Exibe mensagem de vitória
                JOptionPane.showMessageDialog(null, "Parabéns!!! Você venceu");

                // Pergunta se o jogador deseja jogar novamente
                int jogarNovamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente", JOptionPane.YES_NO_OPTION);

                // Se o jogador escolher jogar novamente, embaralha os botões e retorna true
                if (jogarNovamente == 0) {
                    embaralhar(botoes);
                    return true;
                } else {
                    // Se o jogador não quiser jogar novamente, exibe mensagem de despedida e encerra o programa
                    JOptionPane.showMessageDialog(null, "Obrigada por jogar!");
                    System.exit(0);
                }
            }
        }

        // Se o jogador não tiver vencido ainda, retorna false
        return false;
    }

    // Método para embaralhar os botões do jogo
    public void embaralhar(JButton[] botoes) {
        // Criando um ArrayList de String para armazenar os valores dos botões
        List<String> valores = new ArrayList<>();

        // Adiciona os valores dos botões na lista
        for (int i = 0; i < botoes.length; i++) {
            JButton botao = botoes[i];
            valores.add(botao.getText());
        }

        // Embaralha a lista de valores dos botões
        Collections.shuffle(valores);

        // Define os valores embaralhados nos botões
        for (int i = 0; i < botoes.length; i++) {
            botoes[i].setText(valores.get(i));
        }
    }

}
