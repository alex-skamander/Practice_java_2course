package com.company.pr10;

import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int k, s, d, count = 0, sum = 0;
        k = scanner.nextInt();
        s = scanner.nextInt();


        for (int i=(int)Math.pow(10,(double)(k-1)); i<(int)Math.pow(10,(double)k);i++){
            d = i;

            while (d != 0){
                sum += d%10;
                d = d/10;
            }

            if (sum == s)
                count++;
            sum = 0;
        }
        System.out.println(count);
    }
}
