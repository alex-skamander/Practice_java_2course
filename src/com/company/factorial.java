package com.company;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = in.nextInt();
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);
        in.close();
    }
}
