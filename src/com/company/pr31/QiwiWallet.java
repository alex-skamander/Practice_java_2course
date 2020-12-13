package com.company.pr31;

import java.util.HashMap;

public class QiwiWallet implements PayStrategy {
    private String email;
    private String password;

    @Override
    public void pay(int sum) {
        System.out.println("Оплата через электронный кошелек Qiwi на сумму: " + sum);
    }
}