package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult {
    private String title;
    private long aggregatedCount;
    private Debug debug;
    private ItemStackElement[] itemStacks;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("aggregatedCount")
    public long getAggregatedCount() { return aggregatedCount; }
    @JsonProperty("aggregatedCount")
    public void setAggregatedCount(long value) { this.aggregatedCount = value; }

    @JsonProperty("debug")
    public Debug getDebug() { return debug; }
    @JsonProperty("debug")
    public void setDebug(Debug value) { this.debug = value; }

    @JsonProperty("itemStacks")
    public ItemStackElement[] getItemStacks() { return itemStacks; }
    @JsonProperty("itemStacks")
    public void setItemStacks(ItemStackElement[] value) { this.itemStacks = value; }

}
