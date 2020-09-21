package com.company.pr5;

public class Square extends Shape {
    private double side;

    public Square(double side, double border) {
        super(border);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
