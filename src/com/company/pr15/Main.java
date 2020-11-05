package com.company.pr15;

public class Main {
    public static void main(String[] args) {
        MyCollection mass = new MyCollection(2, 100, 600, 300, 65, 778, 204);
        System.out.println(mass);
        mass.add(509);
        mass.remove(100);
        System.out.println(mass);
        System.out.println("Поиск по значению: " + mass.search(509));
        System.out.println("Поиск по индексу: " + mass.searchIndex(5));
        System.out.println("Максимум: " + mass.max());
        System.out.println("Минимум: " + mass.min());
        System.out.println("Среднее: " + mass.average());
    }
}
