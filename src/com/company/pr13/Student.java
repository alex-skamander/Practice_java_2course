package com.company.pr13;

public class Student {
    private String name;
    private int id;
    private int rating;

    public Student(String name, int id, int rating) {
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
}
