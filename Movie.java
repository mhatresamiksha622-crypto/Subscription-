package com.streamora.app;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private String mood;
    private String description;
    private String type;
    private int points;

    public Movie() {
    }

    public Movie(int id, String title, String genre,
                 String mood, String description,
                 String type, int points) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.mood = mood;
        this.description = description;
        this.type = type;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getMood() {
        return mood;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPoints() {
        return points;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
