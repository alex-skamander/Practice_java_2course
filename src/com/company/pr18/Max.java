package com.company.pr18;

public class Max {
    public static int maxim() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, maxim());
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел: ");
        System.out.println(maxim());
    }
}
