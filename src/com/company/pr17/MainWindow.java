package com.company.pr17;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Это гусеница");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}