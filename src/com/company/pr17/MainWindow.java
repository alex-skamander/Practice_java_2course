package com.company.pr17;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Гусеничка хочет кушать \uD83D\uDC1B");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340,365);
        setLocation(420,420);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
