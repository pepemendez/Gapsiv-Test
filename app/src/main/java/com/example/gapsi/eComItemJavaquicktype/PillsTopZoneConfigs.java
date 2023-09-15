package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PillsTopZoneConfigs {
    private String typename;
    private String moduleSource;
    private PillsV2[] pillsV2;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("moduleSource")
    public String getModuleSource() { return moduleSource; }
    @JsonProperty("moduleSource")
    public void setModuleSource(String value) { this.moduleSource = value; }

    @JsonProperty("pillsV2")
    public PillsV2[] getPillsV2() { return pillsV2; }
    @JsonProperty("pillsV2")
    public void setPillsV2(PillsV2[] value) { this.pillsV2 = value; }
}
