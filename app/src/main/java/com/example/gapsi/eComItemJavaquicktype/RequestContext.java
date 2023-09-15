package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class RequestContext {
    private boolean isFitmentFilterQueryApplied;
    private String searchMatchType;
    private Categories categories;
    private boolean hasGicIntent;
    private String vertical;

    @JsonProperty("isFitmentFilterQueryApplied")
    public boolean getIsFitmentFilterQueryApplied() { return isFitmentFilterQueryApplied; }
    @JsonProperty("isFitmentFilterQueryApplied")
    public void setIsFitmentFilterQueryApplied(boolean value) { this.isFitmentFilterQueryApplied = value; }

    @JsonProperty("searchMatchType")
    public String getSearchMatchType() { return searchMatchType; }
    @JsonProperty("searchMatchType")
    public void setSearchMatchType(String value) { this.searchMatchType = value; }

    @JsonProperty("categories")
    public Categories getCategories() { return categories; }
    @JsonProperty("categories")
    public void setCategories(Categories value) { this.categories = value; }

    @JsonProperty("hasGicIntent")
    public boolean getHasGicIntent() { return hasGicIntent; }
    @JsonProperty("hasGicIntent")
    public void setHasGicIntent(boolean value) { this.hasGicIntent = value; }

    @JsonProperty("vertical")
    public String getVertical() { return vertical; }
    @JsonProperty("vertical")
    public void setVertical(String value) { this.vertical = value; }
}
