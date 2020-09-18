package com.company.pr3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Circle circ = new Circle();
        System.out.print("Введите радиус:");
        int radius = in.nextInt();
        circ.setRadius(radius);
        System.out.println("Радиус = " + radius);
        in.close();
        circ.setDiameter();
        System.out.println("Диаметр = " + circ.getDiameter());
        circ.setSquare();
        System.out.println("Площадь = " + circ.getSquare());
        circ.setLine();
        System.out.println("Длина = " + circ.getLine());
    }
}
