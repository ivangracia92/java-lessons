package com.ironhack.w1.d3;

public class Movie {
    private String title;
    private int duration;
    public final boolean IS_GOOD = true;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }


    public void play() {
        System.out.println("Now playing " + this.title);
    }

    public static void displayAlert() {
        System.out.println("It's illegal to pirate this movie");
    }
}
