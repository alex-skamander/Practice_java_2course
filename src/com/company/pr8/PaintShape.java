package com.company.pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintShape extends JFrame {

    private final int windowWidth = 1000;
    private final int windowHeight = 1000;
    private final int amountOfShapes = 20;

    public PaintShape() {
        super("Random Shapes Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setVisible(true);
    }

    public String getRandomColor() {
        int rand = new Random().nextInt(0xffffff + 1);
        return String.format("#%06x", rand);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < amountOfShapes; i++) {
            int x = new Random().nextInt(windowWidth);
            int y = new Random().nextInt(windowHeight);

            int w = new Random().nextInt(windowWidth / 10) + 1;
            int h = new Random().nextInt(windowHeight/ 10) + 1;

            String color = getRandomColor();

            int choice = new Random().nextInt(2) + 1;

            Shape shape = null;

            if (choice == 1) shape = new Circle(x, y, w, color);
            if (choice == 2) shape = new Rectangle(x, y, w, h, color);

            shape.drawShape(g);
        }
    }
}
