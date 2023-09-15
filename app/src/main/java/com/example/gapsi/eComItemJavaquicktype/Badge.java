package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Badge {
    private String text;
    private BadgeID id;
    private BadgeType type;
    private BadgeKey key;
    private String bundleID;
    private BadgeTypename typename;
    private Object styleID;

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("id")
    public BadgeID getID() { return id; }
    @JsonProperty("id")
    public void setID(BadgeID value) { this.id = value; }

    @JsonProperty("type")
    public BadgeType getType() { return type; }
    @JsonProperty("type")
    public void setType(BadgeType value) { this.type = value; }

    @JsonProperty("key")
    public BadgeKey getKey() { return key; }
    @JsonProperty("key")
    public void setKey(BadgeKey value) { this.key = value; }

    @JsonProperty("bundleId")
    public String getBundleID() { return bundleID; }
    @JsonProperty("bundleId")
    public void setBundleID(String value) { this.bundleID = value; }

    @JsonProperty("__typename")
    public BadgeTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(BadgeTypename value) { this.typename = value; }

    @JsonProperty("styleId")
    public Object getStyleID() { return styleID; }
    @JsonProperty("styleId")
    public void setStyleID(Object value) { this.styleID = value; }
}
