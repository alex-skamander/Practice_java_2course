package com.company.pr10;
import java.util.Scanner;

public class LeftRight {
    public static void num (int n){
        if (n / 10 > 0)
            num (n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        num (n);
    }
}
