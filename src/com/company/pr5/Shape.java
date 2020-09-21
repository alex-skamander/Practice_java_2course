package com.company.pr5;

public abstract class Shape {
    private double border;

    public Shape(double border) {
        this.border = border;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
