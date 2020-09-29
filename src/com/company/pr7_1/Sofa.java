package com.company.pr7_1;

public class Sofa extends Furniture {
    private Boolean isUnfolds;
    private double numberSeats;

    public Sofa(double price, String color, String size, String manufacturer, String material, Boolean isUnfolds, double numberSeats) {
        super(price, color, size, manufacturer, material);
        this.isUnfolds = isUnfolds;
        this.numberSeats = numberSeats;
    }

    public void setNumberSeats(double numberSeats) {
        this.numberSeats = numberSeats;
    }

    public double getNumberSeats() {
        return numberSeats;
    }

    public void setUnfolds(Boolean unfolds) {
        isUnfolds = unfolds;
    }

    public Boolean getUnfolds() {
        return isUnfolds;
    }

    @Override
    public String toString() {
        return "Диван {" +
                super.toString() +
                "раскладывается =" + isUnfolds +
                ", количество мест ='" + numberSeats + '\'' +
                '}';
    }
}
