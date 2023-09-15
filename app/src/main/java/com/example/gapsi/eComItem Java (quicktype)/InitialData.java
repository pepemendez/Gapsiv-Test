import com.fasterxml.jackson.annotation.*;

public class InitialData {
    private SearchResult searchResult;
    private ContentLayoutPageMetadata pageMetadata;
    private Headers headers;
    private ModuleDataByZone moduleDataByZone;
    private InitialDataContentLayout contentLayout;
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

    @JsonProperty("moduleDataByZone")
    public ModuleDataByZone getModuleDataByZone() { return moduleDataByZone; }
    @JsonProperty("moduleDataByZone")
    public void setModuleDataByZone(ModuleDataByZone value) { this.moduleDataByZone = value; }

    @JsonProperty("contentLayout")
    public InitialDataContentLayout getContentLayout() { return contentLayout; }
    @JsonProperty("contentLayout")
    public void setContentLayout(InitialDataContentLayout value) { this.contentLayout = value; }

    @JsonProperty("layoutContainerData")
    public LayoutContainerData getLayoutContainerData() { return layoutContainerData; }
    @JsonProperty("layoutContainerData")
    public void setLayoutContainerData(LayoutContainerData value) { this.layoutContainerData = value; }
}
