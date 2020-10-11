package com.company.pr10;
import java.util.Scanner;

public class Nulls {
    public  static int c = 0;
    public static void fun(int a, int b, int a1, int b1, int c1, String d){
        if (a1 == a && b1 == b) {
            c++;
            System.out.println(d);
        }

        if (a1 != a && c1 != 0)
            fun(a, b,a1 + 1, b1,0,d + 0);
        if (b1 != b)
            fun(a, b, a1,b1 + 1,1,d + 1);

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        fun (a, b,0,0,10,"");
        System.out.println(c);
    }
}
