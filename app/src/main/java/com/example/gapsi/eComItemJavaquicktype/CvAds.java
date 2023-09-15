package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class CvAds {
    private AdsAll all;

    @JsonProperty("_all_")
    public AdsAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(AdsAll value) { this.all = value; }
}
