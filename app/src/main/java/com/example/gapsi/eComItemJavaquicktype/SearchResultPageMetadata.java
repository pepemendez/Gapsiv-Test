package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class SearchResultPageMetadata {
    private String title;
    private Object storeSelectionHeader;
    private FluffyLocation location;
    private boolean subscriptionEligible;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("storeSelectionHeader")
    public Object getStoreSelectionHeader() { return storeSelectionHeader; }
    @JsonProperty("storeSelectionHeader")
    public void setStoreSelectionHeader(Object value) { this.storeSelectionHeader = value; }

    @JsonProperty("location")
    public FluffyLocation getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(FluffyLocation value) { this.location = value; }

    @JsonProperty("subscriptionEligible")
    public boolean getSubscriptionEligible() { return subscriptionEligible; }
    @JsonProperty("subscriptionEligible")
    public void setSubscriptionEligible(boolean value) { this.subscriptionEligible = value; }
}
