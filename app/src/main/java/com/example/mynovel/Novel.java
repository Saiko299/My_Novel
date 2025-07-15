package com.example.mynovel;

public class Novel {
    public String title;
    public String description;
    public String genre1;
    public String genre2;
    public String score;
    public int imageResId;

    public Novel(String title, String description, String genre1, String genre2, String score, int imageResId) {
        this.title = title;
        this.description = description;
        this.genre1 = genre1;
        this.genre2 = genre2;
        this.score = score;
        this.imageResId = imageResId;
    }
}
