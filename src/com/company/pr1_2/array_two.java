package com.company.pr1_2;

public class array_two {

    public static void main(String[] args) {
        int Array2[] = {1, 5, 6, 9, 2};
        int sum = 0;
        int i = 0;
        while (i < Array2.length) {
            sum += Array2[i];
            i++;
        }
        System.out.println(sum);
    }
}