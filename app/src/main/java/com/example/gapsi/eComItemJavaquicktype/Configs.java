package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Configs {
    private String moduleLocation;

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }
}
