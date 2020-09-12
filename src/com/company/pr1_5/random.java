package com.company.pr1_5;

public class random {
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    public static void main(String[] args) {
        System.out.println("Генерируем массив случайных чисел:");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сортированный массив:");
        bubbleSort(array);
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
            }
        }
    }