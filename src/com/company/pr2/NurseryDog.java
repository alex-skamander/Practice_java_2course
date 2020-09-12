package com.company.pr2;
import java.util.ArrayList;

public class NurseryDog {
    ArrayList <Dog> dogs = new ArrayList <Dog>();

    public void Add(String name, int age){
        dogs.add(new Dog(name, age));
    }
    public void Show(){
        System.out.println(dogs);

    }
}
