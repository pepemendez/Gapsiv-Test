package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ProductType {
    private String name;
    private double score;
    private Source source;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("score")
    public double getScore() { return score; }
    @JsonProperty("score")
    public void setScore(double value) { this.score = value; }

    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }
}
