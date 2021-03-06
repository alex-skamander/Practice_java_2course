package com.company.pr13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private ArrayList<Student> students;

    private void quickSort(ArrayList<Student> students, int low, int high) {
        this.students = students;

        if (students.size() == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student prop = students.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (compare(students.get(i), prop) > 0)
                i++;
            while (compare(students.get(j), prop) < 0)
                j--;
            if (i <= j) {
                Collections.swap(students, i, j);
                i++;
                j--;
            }
            if (low < j)
                quickSort(students, low, j);
            if (high > i)
                quickSort(students, i, high);
        }
    }

    public SortingStudentsByGPA(ArrayList<Student> students) {
        this.students = students;
        int low = 0, high = students.size() - 1;
        quickSort(students, low, high);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }

    public void PrintList() {
        for (Student s : students) {
            System.out.println("Student " + s.getName() + ": id" + s.getId() + ", rating is " + s.getRating());
        }
    }
}
