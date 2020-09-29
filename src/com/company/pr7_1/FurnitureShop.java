package com.company.pr7_1;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furniture = new ArrayList<Furniture>();

    public FurnitureShop() {
    }

    void addBedInShop(Bed ... args) {
        for (int i=0;i<args.length;i++) {
            furniture.add(args[i]);
        }
    }

    void addSofaInShop(Sofa ... args){
        for (int i=0;i<args.length;i++) {
            furniture.add(args[i]);
        }
    }

    void addTableInShop(Table ... args){
        for (int i=0;i<args.length;i++) {
            furniture.add(args[i]);
        }
    }

    ArrayList<Furniture> getFurniture(){
        return furniture;
    }
}