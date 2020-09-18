package com.company.pr3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Майкл Панке", "Выживший", "Вестерн", 2002, 10, 320);
        System.out.printf(book.toString());
    }
}
