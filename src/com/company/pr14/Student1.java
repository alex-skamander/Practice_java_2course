package com.company.pr14;
import java.util.Comparator;
import java.util.Objects;

public class Student1 implements Comparator  {
    private int ID;
    public Student1(int ID){
        this.ID = ID;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        Student1 student = (Student1) o;

        return this.ID == student.getID();
    }

    public int getID() {
        return ID;
    }
}
