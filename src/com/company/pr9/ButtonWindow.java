package com.company.pr9;

import com.company.pr8.PaintShape;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonWindow extends JFrame {
    Button bw = new Button("START");

    public ButtonWindow() {
        super("Main window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(1920,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(bw);
        bw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PaintShape();
            }
        });
    }


    public static void main(String[] args) {
        new ButtonWindow();
    }
}
