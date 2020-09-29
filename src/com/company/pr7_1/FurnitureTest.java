package com.company.pr7_1;

public class FurnitureTest {
    public static void main(String args[]){
        FurnitureShop myShop = new FurnitureShop();
        Person me = new Person();

        Bed myBed = new Bed(12599, "черный", "200*140","IKEA","сталь",true,"Обычная кровать, под которой могут прятаться монстры", "лурой(не знаю, чо это значит)");
        myShop.addBedInShop(myBed);
        int i = myShop.getFurniture().indexOf(myBed);
        System.out.println(myShop.getFurniture().get(i));

        Table myTable = new Table(12999,"черный","размер мечты","IKEA","дерево",4,140,70,70);
        myShop.addTableInShop(myTable);
        int j = myShop.getFurniture().indexOf(myTable);
        System.out.println(myShop.getFurniture().get(j));

        Sofa mySofa = new Sofa(23999,"серый, но, надеюсь, не как твоя жизнь","140*204","IKEA","дерево",true,5);
        myShop.addSofaInShop(mySofa);
        int k = myShop.getFurniture().indexOf(mySofa);
        System.out.println(myShop.getFurniture().get(k));

        me.byFurniture(myShop.getFurniture().get(i));
        me.byFurniture(myShop.getFurniture().get(j));
        me.byFurniture(myShop.getFurniture().get(k));

        System.out.println(me.getBuy());
    }
}
