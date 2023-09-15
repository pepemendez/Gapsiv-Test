package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class INVALIDConfigs {
    private String typename;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }
}
