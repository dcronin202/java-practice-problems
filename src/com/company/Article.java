package com.company;

public class Article implements PageCollection {
    private int pageCount = 0;
    private String title = "";

    private NewsSource source;

    public Article(int count, String title, NewsSource src) {
        this.title = title;
        this.pageCount = count;
        this.source = src;
    }

    @Override
    public int getNumberOfPages() {
        return pageCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public NewsSource getNewsSource() {
        return source;
    }
}
