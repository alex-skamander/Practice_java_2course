package com.company.pr7;

public class DishTest {
    public static void main(String[] args) {
        Skillet skillet = new Skillet("oleophobic", "square", "green", "iron");
        System.out.println(skillet);

        Pan pan = new Pan(true, 5, "black", "iron");
        System.out.println(pan);

        Battledore battledore = new Battledore("red", "wood", 30);
        System.out.println(battledore);
    }
}
