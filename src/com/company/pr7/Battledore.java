package com.company.pr7;

public class Battledore extends Dish {
    private double length;

    public Battledore(String color, String material, double length) {
        super(color, material);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Battledore{" +
                "length=" + length +
                ", color=" + super.getColor() +
                ", material=" + super.getMaterial() +
                '}';
    }
}
