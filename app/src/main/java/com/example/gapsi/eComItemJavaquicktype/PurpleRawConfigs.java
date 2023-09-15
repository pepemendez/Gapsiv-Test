package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleRawConfigs {
    private String moduleLocation;
    private String lazy;
    private String title;

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }

    @JsonProperty("lazy")
    public String getLazy() { return lazy; }
    @JsonProperty("lazy")
    public void setLazy(String value) { this.lazy = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
