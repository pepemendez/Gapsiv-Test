package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FooterData {
    private PurpleContentLayout contentLayout;

    @JsonProperty("contentLayout")
    public PurpleContentLayout getContentLayout() { return contentLayout; }
    @JsonProperty("contentLayout")
    public void setContentLayout(PurpleContentLayout value) { this.contentLayout = value; }
}
