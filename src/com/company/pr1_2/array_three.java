package com.company.pr1_2;

public class array_three {
    public static void main(String[] args) {
        int Array3[] = {1, 5, 6, 9, 2};
        int sum = 0;
        int i = 0;
        do {
            sum += Array3[i];
            i++;
        }
        while (i < Array3.length);
        System.out.println(sum);
    }
}
