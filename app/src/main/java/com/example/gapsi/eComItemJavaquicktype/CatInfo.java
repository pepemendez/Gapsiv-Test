package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class CatInfo {
    private String name;
    private String catID;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("catId")
    public String getCatID() { return catID; }
    @JsonProperty("catId")
    public void setCatID(String value) { this.catID = value; }
}
