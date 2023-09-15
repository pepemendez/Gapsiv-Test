package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Category {
    private Object path;

    @JsonProperty("path")
    public Object getPath() { return path; }
    @JsonProperty("path")
    public void setPath(Object value) { this.path = value; }
}
