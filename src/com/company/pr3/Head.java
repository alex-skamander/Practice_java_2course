package com.company.pr3;

public class Head {
    private static String colorHair;

    public Head() {
    }

    public Head(String colorHair) {
        Head.colorHair = colorHair;
    }

    public static void setColorHair(String hair) {
        Head.colorHair = hair;
    }
    public static String getColorHair() {
        return colorHair;
    }
}
