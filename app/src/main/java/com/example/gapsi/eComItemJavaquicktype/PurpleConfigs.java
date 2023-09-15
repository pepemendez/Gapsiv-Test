package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleConfigs {
    private ConfigsSubLink[] subLinks;

    @JsonProperty("subLinks")
    public ConfigsSubLink[] getSubLinks() { return subLinks; }
    @JsonProperty("subLinks")
    public void setSubLinks(ConfigsSubLink[] value) { this.subLinks = value; }
}
