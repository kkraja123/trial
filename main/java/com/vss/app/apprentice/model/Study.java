package com.vss.app.apprentice.model;

public class Study {
    private String bookName;
    private String bookAuther;
    private String page;
    private int score;

    public Study(String bookName, String bookAuther, String page, int score) {
        this.bookName = bookName;
        this.bookAuther = bookAuther;
        this.page = page;
        this.score = score;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public String getPage() {
        return page;
    }

    public int getScore() {
        return score;
    }
}


