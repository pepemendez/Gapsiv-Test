import com.fasterxml.jackson.annotation.*;

public class PageContext {
    private SearchNormalize searchNormalize;

    @JsonProperty("searchNormalize")
    public SearchNormalize getSearchNormalize() { return searchNormalize; }
    @JsonProperty("searchNormalize")
    public void setSearchNormalize(SearchNormalize value) { this.searchNormalize = value; }
}
