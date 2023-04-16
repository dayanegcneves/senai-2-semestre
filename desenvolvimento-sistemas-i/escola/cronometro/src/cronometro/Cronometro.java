package cronometro;

import java.awt.event.*;
import javax.swing.*;

public class Cronometro extends JFrame {
    private JLabel label;
    private Timer timer;
    private long horaInicio;

    public Cronometro() {
        super("Cronômetro");

        label = new JLabel("00:00:00");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                horaInicio = System.currentTimeMillis();
                timer.start();
            }
        });
        add(btnIniciar, "North");

        JButton btnParar = new JButton("Parar");
        btnParar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        add(btnParar, "South");

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long tempoDecorrido = System.currentTimeMillis() - horaInicio;
                int horas = (int) (tempoDecorrido / 3600000);
                int minutos = (int) ((tempoDecorrido / 60000) % 60);
                int segundos = (int) ((tempoDecorrido / 1000) % 60);
                String tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
                label.setText(tempoFormatado);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Cronometro();
    }
}
