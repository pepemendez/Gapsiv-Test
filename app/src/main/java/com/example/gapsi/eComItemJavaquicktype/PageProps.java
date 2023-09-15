package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageProps {
    private InitialData initialData;

    @JsonProperty("initialData")
    public InitialData getInitialData() { return initialData; }
    @JsonProperty("initialData")
    public void setInitialData(InitialData value) { this.initialData = value; }
}
