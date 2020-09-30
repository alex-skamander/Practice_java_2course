package com.company.pr7_1;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> basket = new ArrayList<Furniture>();

    public Person() {
    }

    public void buyFurniture(Furniture obj){
        basket.add(obj);
    }

    String getBuy(){
        return basket.toString();
    }
}
