package com.company.pr18;

public class Multipliers {
    public static void multipliers(int n, int k) {
        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + " ");
            multipliers(n / k, k);
        }
        else {
            multipliers(n, ++k);
        }
    }
    public static void main(String[] args) {
        System.out.println("Результат: ");
        multipliers(300, 2);
    }
}
