import com.fasterxml.jackson.annotation.*;

public class ItemStackElement {
    private Meta meta;
    private String title;
    private String totalItemCountDisplay;
    private long count;
    private ItemElement[] items;
    private String layoutEnum;
    private Object queryUsedForSearchResults;
    private Object content;
    private Object titleKey;

    @JsonProperty("meta")
    public Meta getMeta() { return meta; }
    @JsonProperty("meta")
    public void setMeta(Meta value) { this.meta = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("totalItemCountDisplay")
    public String getTotalItemCountDisplay() { return totalItemCountDisplay; }
    @JsonProperty("totalItemCountDisplay")
    public void setTotalItemCountDisplay(String value) { this.totalItemCountDisplay = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    @JsonProperty("items")
    public ItemElement[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(ItemElement[] value) { this.items = value; }

    @JsonProperty("layoutEnum")
    public String getLayoutEnum() { return layoutEnum; }
    @JsonProperty("layoutEnum")
    public void setLayoutEnum(String value) { this.layoutEnum = value; }

    @JsonProperty("queryUsedForSearchResults")
    public Object getQueryUsedForSearchResults() { return queryUsedForSearchResults; }
    @JsonProperty("queryUsedForSearchResults")
    public void setQueryUsedForSearchResults(Object value) { this.queryUsedForSearchResults = value; }

    @JsonProperty("content")
    public Object getContent() { return content; }
    @JsonProperty("content")
    public void setContent(Object value) { this.content = value; }

    @JsonProperty("titleKey")
    public Object getTitleKey() { return titleKey; }
    @JsonProperty("titleKey")
    public void setTitleKey(Object value) { this.titleKey = value; }
}
