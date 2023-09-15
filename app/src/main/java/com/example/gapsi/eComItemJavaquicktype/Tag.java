package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Tag {
    private BadgeTypename typename;
    private TagKey key;
    private Label text;
    private TagType type;

    @JsonProperty("__typename")
    public BadgeTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(BadgeTypename value) { this.typename = value; }

    @JsonProperty("key")
    public TagKey getKey() { return key; }
    @JsonProperty("key")
    public void setKey(TagKey value) { this.key = value; }

    @JsonProperty("text")
    public Label getText() { return text; }
    @JsonProperty("text")
    public void setText(Label value) { this.text = value; }

    @JsonProperty("type")
    public TagType getType() { return type; }
    @JsonProperty("type")
    public void setType(TagType value) { this.type = value; }
}
