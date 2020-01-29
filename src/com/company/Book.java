package com.company;

public class Book implements PageCollection {
    private int pageCount = 0;
    private String title = "";

    private String author = "";

    public Book(int count, String title, String author) {
        this.title = title;
        this.pageCount = count;
        this.author = author;
    }

    @Override
    public int getNumberOfPages() {
        return pageCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
