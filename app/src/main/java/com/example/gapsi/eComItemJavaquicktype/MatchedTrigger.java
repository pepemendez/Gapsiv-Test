package com.example.gapsi.eComItemJavaquicktype;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchedTrigger {
    private String zone;

    private String pageId;

    @JsonProperty("zone")
    public String getZone() { return zone; }
    @JsonProperty("zone")
    public void setZone(String value) { this.zone = value; }


    @JsonProperty("pageId")
    public String getPageId() { return pageId; }
    @JsonProperty("pageId")
    public void setPageId(String value) { this.pageId = value; }
}
