package com.company.pr27;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Егор", "Егорович", "Егоров");
        Person person2 = new Person("Сергей", "", "Павлов");
        Person person3 = new Person("", "", "Смирнов");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}