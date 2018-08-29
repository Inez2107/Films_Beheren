package com.company;

public class Rating {
    private int rating;

    public Rating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return rating+"";
    }
}
