package com.irfan.sampling.androidlatihan3_list.recycleSamples;

/**
 * created by Irfan Assidiq on 2019-05-19
 * email : assidiq.irfan@gmail.com
 **/
public class ModelMovie {
    private String title, genre, year;

    public ModelMovie(){}
    public ModelMovie(String title, String genre, String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
