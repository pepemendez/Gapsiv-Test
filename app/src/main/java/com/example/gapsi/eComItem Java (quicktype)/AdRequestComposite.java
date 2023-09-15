import com.fasterxml.jackson.annotation.*;

public class AdRequestComposite {
    private String categoryID;
    private String facets;
    private String keyword;
    private boolean isDebug;
    private boolean isManualShelf;

    @JsonProperty("categoryId")
    public String getCategoryID() { return categoryID; }
    @JsonProperty("categoryId")
    public void setCategoryID(String value) { this.categoryID = value; }

    @JsonProperty("facets")
    public String getFacets() { return facets; }
    @JsonProperty("facets")
    public void setFacets(String value) { this.facets = value; }

    @JsonProperty("keyword")
    public String getKeyword() { return keyword; }
    @JsonProperty("keyword")
    public void setKeyword(String value) { this.keyword = value; }

    @JsonProperty("isDebug")
    public boolean getIsDebug() { return isDebug; }
    @JsonProperty("isDebug")
    public void setIsDebug(boolean value) { this.isDebug = value; }

    @JsonProperty("isManualShelf")
    public boolean getIsManualShelf() { return isManualShelf; }
    @JsonProperty("isManualShelf")
    public void setIsManualShelf(boolean value) { this.isManualShelf = value; }
}
