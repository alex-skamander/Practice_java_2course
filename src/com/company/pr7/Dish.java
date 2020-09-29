package com.company.pr7;

public abstract class Dish {
    private String color;
    private String material;

    public Dish(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
