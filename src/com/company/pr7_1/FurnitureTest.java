package com.company.pr7_1;

import java.util.Scanner;

public class FurnitureTest {
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        FurnitureShop myShop = new FurnitureShop();
        Person me = new Person();

        Bed myBed = new Bed(12599, "черный", "IKEA","сталь",true, "лурой");
        myShop.addBedInShop(myBed);
        int i = myShop.getFurniture().indexOf(myBed);
        System.out.println(myShop.getFurniture().get(i));

        Table myTable = new Table(12999,"черный","IKEA","дерево",4,140,70,70);
        myShop.addTableInShop(myTable);
        int j = myShop.getFurniture().indexOf(myTable);
        System.out.println(myShop.getFurniture().get(j));

        Sofa mySofa = new Sofa(23999,"серый","IKEA","дерево",true,5);
        myShop.addSofaInShop(mySofa);
        int k = myShop.getFurniture().indexOf(mySofa);
        System.out.println(myShop.getFurniture().get(k));

        me.buyFurniture(myShop.getFurniture().get(i));
        me.buyFurniture(myShop.getFurniture().get(j));
        me.buyFurniture(myShop.getFurniture().get(k));

        System.out.println(me.getBuy());
    }
}
