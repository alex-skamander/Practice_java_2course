package com.company.pr2;

public class Dog {
    private String name;
    private int age;
    public int ageHuman;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int ageDog(int age){
        ageHuman = age*7;
        return ageHuman;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}