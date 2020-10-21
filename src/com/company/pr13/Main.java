package com.company.pr13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int getRandomId() {
        int min = 100;
        int max = 99;
        int difference = max - min;
        Random random = new Random();
        int i = random.nextInt(difference + 1);
        i += min;
        return i;
    }

    public static int getRandomRate() {
        int min = 1;
        int max = 10;
        int difference = max - min;
        Random random = new Random();
        int i = random.nextInt(difference + 1);
        i += min;
        return i;
    }

    public static void mergeSort(int[] a, int b, int c) {
        if (c <= b)
            return;
        int mid = b + (c - b) / 2;
        mergeSort(a, b, mid);
        mergeSort(a, mid + 1, c);
        int[] buf = Arrays.copyOf(a, a.length);
        for (int k = b; k <= c; k++)
            buf[k] = a[k];
        int i = b, j = mid + 1;
        for (int k = b; k <= c; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > c) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Кудряшова", getRandomId(), getRandomRate()));
        students.add(new Student("Бутко", getRandomId(), getRandomRate()));
        students.add(new Student("Зверев", getRandomId(), getRandomRate()));
        students.add(new Student("Корольков", getRandomId(), getRandomRate()));
        int[] idNumber = new int[students.size()];
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            idNumber[i] = s.getId();
        }
        System.out.println("Students");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Student " + s.getName() + ": id" + s.getId() + ", rating is " + s.getRating());
        }
        mergeSort(idNumber, 0, idNumber.length - 1);
        System.out.println("\nSorted id numbers: ");
        for (int i = 0; i < idNumber.length; i++) {
            System.out.println("id" + idNumber[i]);
            SortingStudentsByGPA sortGrades = new SortingStudentsByGPA(students);
            System.out.println("\nStudents sorted by grades:");
            sortGrades.PrintList();
        }
    }
}
