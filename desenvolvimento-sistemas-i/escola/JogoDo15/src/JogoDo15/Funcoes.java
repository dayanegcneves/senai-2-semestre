/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDo15;

import javax.swing.JButton;

/**
 *
 * @author daday
 */
public class Funcoes {

    public void mover(JButton bot1, JButton bot2, JButton bot3){
        if(bot2.getText().equals("")){
            bot2.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot3.getText().equals("")){
            bot3.setText(bot1.getText());
            bot1.setText("");
        }
    }
    
    public void mover(JButton bot1, JButton bot2, JButton bot3, JButton bot4){
        if(bot2.getText().equals("")){
            bot2.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot3.getText().equals("")){
            bot3.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot4.getText().equals("")){
            bot4.setText(bot1.getText());
            bot1.setText("");
        }
    }
    
    public void mover(JButton bot1, JButton bot2, JButton bot3, JButton bot4, JButton bot5){
        if(bot2.getText().equals("")){
            bot2.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot3.getText().equals("")){
            bot3.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot4.getText().equals("")){
            bot4.setText(bot1.getText());
            bot1.setText("");
        }
        else if(bot5.getText().equals("")){
            bot5.setText(bot1.getText());
            bot1.setText("");
        }
    }
    
    
}
