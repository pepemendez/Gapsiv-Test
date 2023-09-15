package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FluffyLink {
    private String linkText;
    private String title;
    private FluffyClickThrough clickThrough;
    private String uid;

    @JsonProperty("linkText")
    public String getLinkText() { return linkText; }
    @JsonProperty("linkText")
    public void setLinkText(String value) { this.linkText = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("clickThrough")
    public FluffyClickThrough getClickThrough() { return clickThrough; }
    @JsonProperty("clickThrough")
    public void setClickThrough(FluffyClickThrough value) { this.clickThrough = value; }

    @JsonProperty("uid")
    public String getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(String value) { this.uid = value; }
}
