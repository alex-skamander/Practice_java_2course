package com.company.pr3;

public class Book {
    private String Author;
    private String Name;
    private int Year;
    private int Chapters;
    private int Pages;
    private String Genre;

    public Book(String Author, String Name, String Genre, int Year, int Chapters, int Pages) {
        this.Author = Author;
        this.Chapters = Chapters;
        this.Genre = Genre;
        this.Name = Name;
        this.Pages = Pages;
        this.Year = Year;
    }
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getChapters() {
        return Chapters;
    }

    public void setChapters(int Chapters) {
        this.Chapters = Chapters;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Автор = '" + Author + '\'' +
                ", Название книги = '" + Name + '\'' +
                ", Год выпуска = " + Year +
                ", Количество страниц = " + Pages +
                ", Количество глав = " + Chapters +
                ", Жанр = " + Genre +
                '}';
    }
}
