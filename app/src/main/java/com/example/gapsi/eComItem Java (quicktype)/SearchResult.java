import com.fasterxml.jackson.annotation.*;

public class SearchResult {
    private String title;
    private long aggregatedCount;
    private Debug debug;
    private ItemStackElement[] itemStacks;
    private SearchResultPageMetadata pageMetadata;
    private PaginationV2 paginationV2;
    private Spelling spelling;
    private RequestContext requestContext;
    private ErrorResponse errorResponse;
    private long count;
    private long gridItemsCount;
    private CatInfo catInfo;
    private Object nonProduct;
    private Object pac;
    private RelatedSearch[] relatedSearch;
    private Object translation;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("aggregatedCount")
    public long getAggregatedCount() { return aggregatedCount; }
    @JsonProperty("aggregatedCount")
    public void setAggregatedCount(long value) { this.aggregatedCount = value; }

    @JsonProperty("debug")
    public Debug getDebug() { return debug; }
    @JsonProperty("debug")
    public void setDebug(Debug value) { this.debug = value; }

    @JsonProperty("itemStacks")
    public ItemStackElement[] getItemStacks() { return itemStacks; }
    @JsonProperty("itemStacks")
    public void setItemStacks(ItemStackElement[] value) { this.itemStacks = value; }

    @JsonProperty("pageMetadata")
    public SearchResultPageMetadata getPageMetadata() { return pageMetadata; }
    @JsonProperty("pageMetadata")
    public void setPageMetadata(SearchResultPageMetadata value) { this.pageMetadata = value; }

    @JsonProperty("paginationV2")
    public PaginationV2 getPaginationV2() { return paginationV2; }
    @JsonProperty("paginationV2")
    public void setPaginationV2(PaginationV2 value) { this.paginationV2 = value; }

    @JsonProperty("spelling")
    public Spelling getSpelling() { return spelling; }
    @JsonProperty("spelling")
    public void setSpelling(Spelling value) { this.spelling = value; }

    @JsonProperty("requestContext")
    public RequestContext getRequestContext() { return requestContext; }
    @JsonProperty("requestContext")
    public void setRequestContext(RequestContext value) { this.requestContext = value; }

    @JsonProperty("errorResponse")
    public ErrorResponse getErrorResponse() { return errorResponse; }
    @JsonProperty("errorResponse")
    public void setErrorResponse(ErrorResponse value) { this.errorResponse = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    @JsonProperty("gridItemsCount")
    public long getGridItemsCount() { return gridItemsCount; }
    @JsonProperty("gridItemsCount")
    public void setGridItemsCount(long value) { this.gridItemsCount = value; }

    @JsonProperty("catInfo")
    public CatInfo getCatInfo() { return catInfo; }
    @JsonProperty("catInfo")
    public void setCatInfo(CatInfo value) { this.catInfo = value; }

    @JsonProperty("nonProduct")
    public Object getNonProduct() { return nonProduct; }
    @JsonProperty("nonProduct")
    public void setNonProduct(Object value) { this.nonProduct = value; }

    @JsonProperty("pac")
    public Object getPac() { return pac; }
    @JsonProperty("pac")
    public void setPac(Object value) { this.pac = value; }

    @JsonProperty("relatedSearch")
    public RelatedSearch[] getRelatedSearch() { return relatedSearch; }
    @JsonProperty("relatedSearch")
    public void setRelatedSearch(RelatedSearch[] value) { this.relatedSearch = value; }

    @JsonProperty("translation")
    public Object getTranslation() { return translation; }
    @JsonProperty("translation")
    public void setTranslation(Object value) { this.translation = value; }
}
