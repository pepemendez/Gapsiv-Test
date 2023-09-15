package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class RuntimeConfigAds {
    private String env;
    private String host;
    private String moatID;
    private String moatVideoID;

    @JsonProperty("env")
    public String getEnv() { return env; }
    @JsonProperty("env")
    public void setEnv(String value) { this.env = value; }

    @JsonProperty("host")
    public String getHost() { return host; }
    @JsonProperty("host")
    public void setHost(String value) { this.host = value; }

    @JsonProperty("moatId")
    public String getMoatID() { return moatID; }
    @JsonProperty("moatId")
    public void setMoatID(String value) { this.moatID = value; }

    @JsonProperty("moatVideoId")
    public String getMoatVideoID() { return moatVideoID; }
    @JsonProperty("moatVideoId")
    public void setMoatVideoID(String value) { this.moatVideoID = value; }
}
