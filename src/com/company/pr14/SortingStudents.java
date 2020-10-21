package com.company.pr14;

import com.company.pr14.Student1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student1> {
    private ArrayList<Student1> students;

    private void quickSort(ArrayList<Student1> students, int low, int high) {
        this.students = students;

        if (students.size() == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student1 prop = students.get(middle);

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

    public SortingStudents(ArrayList<Student1> students) {
        this.students = students;
        int low = 0, high = students.size() - 1;
        quickSort(students, low, high);
    }

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }

    public void PrintList() {
        for (Student1 s : students) {
            System.out.println("Student " + s.getName() + ": id" + s.getId() + ", rating is " + s.getRating());
        }
    }
}
