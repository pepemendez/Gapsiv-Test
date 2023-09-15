import com.fasterxml.jackson.annotation.*;

public class PaginationV2 {
    private long maxPage;
    private PageProperties pageProperties;

    @JsonProperty("maxPage")
    public long getMaxPage() { return maxPage; }
    @JsonProperty("maxPage")
    public void setMaxPage(long value) { this.maxPage = value; }

    @JsonProperty("pageProperties")
    public PageProperties getPageProperties() { return pageProperties; }
    @JsonProperty("pageProperties")
    public void setPageProperties(PageProperties value) { this.pageProperties = value; }
}
