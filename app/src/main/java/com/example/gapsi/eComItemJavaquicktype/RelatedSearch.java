package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class RelatedSearch {
    private String title;
    private String url;
    private String imageURL;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("imageUrl")
    public String getImageURL() { return imageURL; }
    @JsonProperty("imageUrl")
    public void setImageURL(String value) { this.imageURL = value; }
}
