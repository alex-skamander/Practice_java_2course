package com.company.pr3;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    private int radius;
    private int diameter;
    private int Square;
    private int Line;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setDiameter() {
        diameter = 2*radius;
    }
    public int getDiameter() {
        return diameter;
    }

    public void setSquare() {
        Square = radius*radius*(int)Math.PI;
    }
    public int getSquare() {
        return Square;
    }

    public void setLine() {
        Line = 2*radius*(int)Math.PI;
    }
    public int getLine() {
        return Line;
    }
}
