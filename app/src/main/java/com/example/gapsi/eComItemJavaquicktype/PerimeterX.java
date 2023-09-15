package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PerimeterX {
    private boolean enable;
    private String initScript;

    @JsonProperty("enable")
    public boolean getEnable() { return enable; }
    @JsonProperty("enable")
    public void setEnable(boolean value) { this.enable = value; }

    @JsonProperty("initScript")
    public String getInitScript() { return initScript; }
    @JsonProperty("initScript")
    public void setInitScript(String value) { this.initScript = value; }
}
