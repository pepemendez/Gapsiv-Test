package com.example.gapsi.eComItemJavaquicktype;
import com.fasterxml.jackson.annotation.*;

public class AdContent {
    private String type;
    private AdContentData data;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("data")
    public AdContentData getData() { return data; }
    @JsonProperty("data")
    public void setData(AdContentData value) { this.data = value; }
}
