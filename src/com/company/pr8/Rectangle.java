package com.company.pr8;

import java.awt.*;

public class Rectangle extends Shape {
    Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height, color);
    }

    @Override
    void drawShape(Graphics g) {
        g.setColor(Color.decode(this.getColor()));
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
