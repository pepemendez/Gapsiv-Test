package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemStackElement {
    private Meta meta;
    private String title;
    private String totalItemCountDisplay;
    private long count;
    private ItemElement[] items;


    @JsonProperty("meta")
    public Meta getMeta() { return meta; }
    @JsonProperty("meta")
    public void setMeta(Meta value) { this.meta = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("totalItemCountDisplay")
    public String getTotalItemCountDisplay() { return totalItemCountDisplay; }
    @JsonProperty("totalItemCountDisplay")
    public void setTotalItemCountDisplay(String value) { this.totalItemCountDisplay = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    @JsonProperty("items")
    public ItemElement[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(ItemElement[] value) { this.items = value; }
}
