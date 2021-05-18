package com.sperry.ratingdataservice.models;
public class Rating {

    int movie_id;
    double ratings;

    public Rating(int movie_id, double ratings) {
        this.movie_id = movie_id;
        this.ratings = ratings;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
