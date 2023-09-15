import com.fasterxml.jackson.annotation.*;

public class SearchArgs {
    private String query;
    private String catID;
    private String prg;
    private String facet;

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("cat_id")
    public String getCatID() { return catID; }
    @JsonProperty("cat_id")
    public void setCatID(String value) { this.catID = value; }

    @JsonProperty("prg")
    public String getPrg() { return prg; }
    @JsonProperty("prg")
    public void setPrg(String value) { this.prg = value; }

    @JsonProperty("facet")
    public String getFacet() { return facet; }
    @JsonProperty("facet")
    public void setFacet(String value) { this.facet = value; }
}
