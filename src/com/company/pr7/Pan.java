package com.company.pr7;

public class Pan extends Dish {
    private Boolean handle = true;
    private double litres;
    public Pan(Boolean handle, double litres, String color, String material) {
        super(color, material);
        this.handle = handle;
        this.litres = litres;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public Boolean getHandle() {
        return handle;
    }

    public void setHandle(Boolean handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "handle=" + handle +
                ", litres=" + litres +
                ", color=" + super.getColor() +
                ", material=" + super.getMaterial() +
                '}';
    }
}
