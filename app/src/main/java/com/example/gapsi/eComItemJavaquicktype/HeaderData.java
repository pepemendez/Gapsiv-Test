package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class HeaderData {
    private FluffyContentLayout contentLayout;

    @JsonProperty("contentLayout")
    public FluffyContentLayout getContentLayout() { return contentLayout; }
    @JsonProperty("contentLayout")
    public void setContentLayout(FluffyContentLayout value) { this.contentLayout = value; }
}
