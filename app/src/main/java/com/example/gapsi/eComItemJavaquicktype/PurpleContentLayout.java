package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleContentLayout {
    private PurpleModule[] modules;

    @JsonProperty("modules")
    public PurpleModule[] getModules() { return modules; }
    @JsonProperty("modules")
    public void setModules(PurpleModule[] value) { this.modules = value; }
}
