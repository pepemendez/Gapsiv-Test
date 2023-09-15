package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FulfillmentIcon {
    private TagKey key;
    private Label label;

    @JsonProperty("key")
    public TagKey getKey() { return key; }
    @JsonProperty("key")
    public void setKey(TagKey value) { this.key = value; }

    @JsonProperty("label")
    public Label getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(Label value) { this.label = value; }
}
