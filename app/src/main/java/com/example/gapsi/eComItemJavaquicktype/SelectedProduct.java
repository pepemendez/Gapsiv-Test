package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class SelectedProduct {
    private String canonicalURL;
    private String usItemID;

    @JsonProperty("canonicalUrl")
    public String getCanonicalURL() { return canonicalURL; }
    @JsonProperty("canonicalUrl")
    public void setCanonicalURL(String value) { this.canonicalURL = value; }

    @JsonProperty("usItemId")
    public String getUsItemID() { return usItemID; }
    @JsonProperty("usItemId")
    public void setUsItemID(String value) { this.usItemID = value; }
}
