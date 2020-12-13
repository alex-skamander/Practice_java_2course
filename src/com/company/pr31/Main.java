package com.company.pr31;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final HashMap<Integer, Integer> shop_db = new HashMap<>(); // id: price

    static {
        shop_db.put(1, 1000);
        shop_db.put(2, 2000);
        shop_db.put(3, 3000);
        shop_db.put(4, 4000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String choiceShopping;
        do {
            System.out.println("Прайс-лист: \n" +
                    "1 - product1 \n" +
                    "2 - product2 \n" +
                    "3 - product3 \n" +
                    "4 - product4 \n");
            int choice = Integer.parseInt(scanner.nextLine());
            sum += shop_db.get(choice);
            System.out.println("Еще?[Y/N]");
            choiceShopping = scanner.nextLine();
        }while (choiceShopping.equalsIgnoreCase("Y"));

        System.out.println("Выберите способ оплаты :\n" +
                "1 - Qiwi\n" +
                "2 - CreditCard");
        choiceShopping = scanner.nextLine();
        PayStrategy strategy;
        if(choiceShopping.equals("1")){
            strategy = new QiwiWallet();
        } else{
            strategy = new CreditCard();
        }
        strategy.pay(sum);

    }
}
