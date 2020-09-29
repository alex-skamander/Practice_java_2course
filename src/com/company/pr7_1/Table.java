package com.company.pr7_1;

public class Table extends Furniture {
    private int numberLeg;
    private double length;
    private double width;
    private double height;

    public Table(double price, String color, String size, String manufacturer, String material, int legNumber, double length, double width, double height) {
        super(price, color, size, manufacturer, material);
        this.numberLeg = numberLeg;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLegNumber(int legNumber) {
        this.numberLeg = numberLeg;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLegNumber() {
        return numberLeg;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стол {" +
                super.toString() +
                ", Количество ног =" + numberLeg +
                ", длина =" + length +
                ", ширина =" + width +
                ", высота =" + height +
                '}';
    }
}
