package com.company.pr14;

import java.util.ArrayList;
import java.util.Objects;

public class Student1 {
    private String name;
    private int id;
    private int rating;

    public Student1(String name, int id, int rating) {
        this.name = name;
        this.id = id;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return id == student.id &&
                rating == student.rating &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, rating);
    }
}
