package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialData {
    private SearchResult searchResult;
    private ContentLayoutPageMetadata pageMetadata;
    private Headers headers;
    private LayoutContainerData layoutContainerData;

    @JsonProperty("searchResult")
    public SearchResult getSearchResult() { return searchResult; }
    @JsonProperty("searchResult")
    public void setSearchResult(SearchResult value) { this.searchResult = value; }

    @JsonProperty("pageMetadata")
    public ContentLayoutPageMetadata getPageMetadata() { return pageMetadata; }
    @JsonProperty("pageMetadata")
    public void setPageMetadata(ContentLayoutPageMetadata value) { this.pageMetadata = value; }

    @JsonProperty("headers")
    public Headers getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Headers value) { this.headers = value; }

    @JsonProperty("layoutContainerData")
    public LayoutContainerData getLayoutContainerData() { return layoutContainerData; }
    @JsonProperty("layoutContainerData")
    public void setLayoutContainerData(LayoutContainerData value) { this.layoutContainerData = value; }
}
