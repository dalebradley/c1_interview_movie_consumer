package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dbradley on 03/09/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private final long movie_id;
    private String title;
    private String description;
    private String producer;
    private Boolean available_in_3d;
    private String age_rating;
    private long likes;

    public Movie(){
        this.movie_id = 1;
    }
    public Movie(long movie_id, String title, String description, String producer,
                 Boolean available_in_3d, String age_rating, long likes
    ) {
        this.movie_id = movie_id;
        this.title = title;
        this.description = description;
        this.producer = producer;
        this.available_in_3d = available_in_3d;
        this.age_rating = age_rating;
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Boolean getAvailable_in_3d() {
        return available_in_3d;
    }

    public void setAvailable_in_3d(Boolean available_in_3d) {
        this.available_in_3d = available_in_3d;
    }

    public String getAge_rating() {
        return age_rating;
    }

    public void setAge_rating(String age_rating) {
        this.age_rating = age_rating;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public long getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Movie with id " + this.movie_id + " and title: " + this.title;
    }
}