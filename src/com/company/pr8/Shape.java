package com.company.pr8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    private String color;
    private int x, y, width, height;

    public Shape(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    abstract void drawShape(Graphics g);
}
