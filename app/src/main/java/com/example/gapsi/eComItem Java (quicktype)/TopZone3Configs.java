import com.fasterxml.jackson.annotation.*;

public class TopZone3Configs {
    private String typename;
    private Facet[] topNavFacets;
    private Facet[] allSortAndFilterFacets;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("topNavFacets")
    public Facet[] getTopNavFacets() { return topNavFacets; }
    @JsonProperty("topNavFacets")
    public void setTopNavFacets(Facet[] value) { this.topNavFacets = value; }

    @JsonProperty("allSortAndFilterFacets")
    public Facet[] getAllSortAndFilterFacets() { return allSortAndFilterFacets; }
    @JsonProperty("allSortAndFilterFacets")
    public void setAllSortAndFilterFacets(Facet[] value) { this.allSortAndFilterFacets = value; }
}
