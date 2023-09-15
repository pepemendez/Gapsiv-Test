package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemElement {
    private String canonicalURL;
    private String description;
    private String image;
    private String name;
    private Long price;
    private String shortDescription;

    @JsonProperty("canonicalUrl")
    public String getCanonicalURL() { return canonicalURL; }
    @JsonProperty("canonicalUrl")
    public void setCanonicalURL(String value) { this.canonicalURL = value; }


    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("price")
    public Long getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(Long value) { this.price = value; }
}
