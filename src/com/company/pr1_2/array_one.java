package com.company.pr1_2;

public class array_one {

    public static void main(String[] args) {
	int Array1[] = {1, 5, 6, 9, 2};
	int sum = 0;
	for(int i = 0; i < Array1.length; i++) {
	    sum += Array1[i];
    }
	System.out.println(sum);
    }
}
