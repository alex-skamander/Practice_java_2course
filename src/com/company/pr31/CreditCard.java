package com.company.pr31;

public class CreditCard implements PayStrategy {
    @Override
    public void pay(int sum) {
        System.out.println("Оплата через кредитную карту на сумму: " + sum);
    }
}
