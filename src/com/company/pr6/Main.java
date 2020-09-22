package com.company.pr6;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(11, 21, 2, 0);
        System.out.println(circle);
        circle.move(10, 50);
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(11, 15, 30, 20, 25);
        System.out.println(rectangle);
        rectangle.move(100, 50);
        System.out.println(rectangle);
    }
}
