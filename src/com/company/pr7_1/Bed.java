package com.company.pr7_1;

public class Bed extends Furniture {
    private String type;
    private String rackBottom;
    private Boolean mattress;

    public Bed(double price, String color, String size, String manufacturer, String material, Boolean mattress, String type, String rackBottom) {
        super(price, color, size, manufacturer, material);
        this.mattress = mattress;
        this.rackBottom = rackBottom;
        this.type = type;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Кровать {" +
                super.toString() +
                "тип ='" + type + '\'' +
                ", реечное дно ='" + rackBottom + '\'' +
                ", матрац =" + mattress +
                '}';
    }
}
