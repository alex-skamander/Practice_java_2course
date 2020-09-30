package com.company.pr7_1;

public abstract class Furniture {
    private double price;
    private String color;
    private String manufacturer;
    private String material;

    public Furniture(double price, String color, String manufacturer, String material) {
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Цена =" + price +
                ", цвет ='" + color + '\'' +
                ", производитель ='" + manufacturer + '\''+
                ", материал ='"+material+'\'';
    }
}
