package com.company.pr3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(false, true, 74, 75, "Рыжий");

        System.out.print("Человек: " + "\nЦвет волос - " + human.getHead());
        System.out.print("\nПравая рука - ");
        human.getHandRight();
        System.out.print("\nЛевая рука - ");
        human.getHandLeft();
        System.out.println("\nДлина правой ноги - " + human.getLegRight() + "\nДлина левой ноги - " + human.getLegLeft());
    }
}
