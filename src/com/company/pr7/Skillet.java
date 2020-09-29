package com.company.pr7;

public class Skillet extends Dish {
    private String coating;
    private String form;
    public Skillet(String coating, String form, String color, String material) {
        super(color, material);
        this.coating = coating;
        this.form = form;
    }

    public String getCoating() {
        return coating;
    }

    public void setCoating(String coating) {
        this.coating = coating;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Skillet{" +
                "coating='" + coating +
                ", form='" + form +
                ", color=" + super.getColor() +
                ", material=" + super.getMaterial() +
                '}';
    }
}
