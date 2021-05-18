package com.sperry.moviecatalogservice.model;

public class Movie {

    int id;
    String name;
    String desc;
    double ratings;

    public Movie(int id, String name, String desc, double ratings) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
