package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Rating {
    private long averageRating;
    private long numberOfReviews;

    @JsonProperty("averageRating")
    public long getAverageRating() { return averageRating; }
    @JsonProperty("averageRating")
    public void setAverageRating(long value) { this.averageRating = value; }

    @JsonProperty("numberOfReviews")
    public long getNumberOfReviews() { return numberOfReviews; }
    @JsonProperty("numberOfReviews")
    public void setNumberOfReviews(long value) { this.numberOfReviews = value; }
}
