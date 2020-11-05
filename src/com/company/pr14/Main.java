package com.company.pr14;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        SortingStudents sort = new SortingStudents();
        Student1 found;
        Student1 a = new Student1(90);

        System.out.println("Быстрая сортировка.\nВведите колличество студентов");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Введите баллы студентов");
        Student1[] students = new Student1[k];
        for (int i = 0; i < students.length; i++){
            int m = scanner.nextInt();
            students[i] = new Student1(m);
        }
        sort.quicksort(students,0,students.length - 1);
        System.out.println("Отсортированный массив по убыванию");
        for(int i = 0; i < students.length; i++){
            System.out.print(students[i].getID() + " ");
        }
        System.out.println();
        if (sort.recursialinearSearch(students, a,0) == null)
            System.out.println("Такого числа не нашлось");
        else{
            found =(Student1)sort.recursialinearSearch(students, a,0);
            System.out.println("Число нашлось "+found.getID());
        }
        Random random = new Random();
        int l = 4000;
        students = new Student1[l];

        for (int i = 0; i < students.length; i++){

            students[i] = new Student1(i);
        }
        sort.quicksort(students,0,students.length - 1);
        long start = System.nanoTime();
        found = (Student1)sort.binarySearch(students,a);
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Время работы бинарнаного поиска обычным методом: "+ String.format("%,12d", time));
        start = System.nanoTime();
        found = (Student1)sort.recursialinearSearch(students, a,0);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Время работы бинарнаного поиска рекурсивным методом: "+ String.format("%,12d", time));
        start = System.nanoTime();
        found = (Student1)sort.linearSearch(students, a);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Время работы линейного поиска обычным методом: "+ String.format("%,12d", time));
        start = System.nanoTime();
        found = (Student1)sort.recursialinearSearch(students, a,0);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Время работы линейного поиска рекурсивным методом: "+ String.format("%,12d", time));
    }
}
