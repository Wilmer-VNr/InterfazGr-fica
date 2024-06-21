package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    public JButton OKButton;
    private JLabel nombreLbl;
    private JButton button1;


    public form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreLbl.setText("Hola a todos, soy Wilmer Vargas");
                nombreLbl.setText("mensaje");


            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            nombreLbl.setText("");
            }
        });
    }
}
