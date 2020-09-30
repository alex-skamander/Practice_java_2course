package com.company.pr7_1;

public class Bed extends Furniture {
    private String rackBottom;
    private Boolean mattress;

    public Bed(double price, String color, String manufacturer, String material, Boolean mattress, String rackBottom) {
        super(price, color, manufacturer, material);
        this.mattress = mattress;
        this.rackBottom = rackBottom;
    }

    public Boolean getMattress() {
        return mattress;
    }

    public void setMattress(Boolean mattress) {
        this.mattress = mattress;
    }

    public String getRackBottom() {
        return rackBottom;
    }

    public void setRackBottom(String rackBottom) {
        this.rackBottom = rackBottom;
    }

    @Override
    public String toString() {
        return "Кровать {" +
                super.toString() +
                ", реечное дно ='" + rackBottom + '\'' +
                ", матрац =" + mattress +
                '}';
    }
}
