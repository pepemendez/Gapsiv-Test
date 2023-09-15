package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ContentLayoutPageMetadata {
    private PurpleLocation location;
    private PageContext pageContext;

    @JsonProperty("location")
    public PurpleLocation getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(PurpleLocation value) { this.location = value; }

    @JsonProperty("pageContext")
    public PageContext getPageContext() { return pageContext; }
    @JsonProperty("pageContext")
    public void setPageContext(PageContext value) { this.pageContext = value; }
}
