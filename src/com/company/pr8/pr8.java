package com.company.pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class graf extends JFrame {
    JTextField jtf = new JTextField(10);
    JTextField jtf1 = new JTextField (10);
    JButton jb = new JButton("Result");
    Font fnt = new Font("Times New Roman", Font.BOLD, 20);
    graf(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 300);
        add(new JLabel("you"));
        add(jtf);
        add(new JLabel("him"));
        add(jtf1);
        add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jtf.getText().trim());
                    double x2 = Double.parseDouble(jtf1.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1+x2));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error!");
                }

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new graf();
    }
}
