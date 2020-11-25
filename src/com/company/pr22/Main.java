package com.company.pr22;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(100000, "Иванов Иван Иванович");
        Shop shop = new Shop();

        HashMap<String, String> INNs = new HashMap<>();
        INNs.put(customer.getName(), customer.getINN());

        Item item1 = new Item("стул", 8000);
        Item item2 = new Item("кровать", 12900);
        Item item3 = new Item("стол", 9000);
        Item item4 = new Item("гирлянда", 1500);

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);
        shop.addItem(item4);

        shop.setINNs(INNs);

        customer.addProduct(shop, 1);

        shop.makeOrder(customer);

        Customer customer1 = new Customer(100, "name");
        customer1.addProduct(shop, 3);
        shop.makeOrder(customer1);
    }
}