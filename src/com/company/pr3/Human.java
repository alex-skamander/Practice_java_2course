package com.company.pr3;

public class Human {
    private Hand handRight = new Hand();
    private Hand handLeft = new Hand();
    private Leg legRight = new Leg();
    private Leg legLeft = new Leg();
    private Head colorHair = new Head();

    public Human() {
    }

    public Human(Boolean isBrokenRight, Boolean isBrokenLeft, int legLeftLength, int legRightLength, String color) {
        handRight.setBroken(isBrokenRight);
        handLeft.setBroken(isBrokenLeft);
        legLeft.setLength(legLeftLength);
        legRight.setLength(legRightLength);
        colorHair.setColorHair(color);
    }

    public void setColorHair(String  color) {
        colorHair.setColorHair(color);
    }

    public void setLegLeft(int length) {
        legLeft.setLength(length);
    }

    public void setLegRight(int length) {
        legRight.setLength(length);
    }

    public void setHandLeft(Boolean isBroken) {
        handLeft.setBroken(isBroken);
    }

    public void setHandRight(Boolean isBroken) {
        handRight.setBroken(isBroken);
    }

    public String getHead() {
        return colorHair.getColorHair();
    }

    public int getLegLeft() {
        return legLeft.getLength();
    }

    public int getLegRight() {
        return legRight.getLength();
    }

    public void getHandLeft() {
        handLeft.Broken();
    }

    public void getHandRight() {
        handRight.Broken();
    }
}
