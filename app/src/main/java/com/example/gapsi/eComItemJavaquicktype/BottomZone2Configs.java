package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class BottomZone2Configs {
    private String typename;
    private PurpleRawConfigs rawConfigs;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("_rawConfigs")
    public PurpleRawConfigs getRawConfigs() { return rawConfigs; }
    @JsonProperty("_rawConfigs")
    public void setRawConfigs(PurpleRawConfigs value) { this.rawConfigs = value; }
}
