import com.fasterxml.jackson.annotation.*;

public class SearchNormalize {
    private String verticalID;
    private String normalizedQuery;
    private String originalQuery;
    private String rewrittenQuery;
    private String specificity;
    private String topQueryCatPath;
    private String topQueryCatPathName;
    private ProductType[] productType;
    private AnalyticsLog analyticsLog;

    @JsonProperty("verticalId")
    public String getVerticalID() { return verticalID; }
    @JsonProperty("verticalId")
    public void setVerticalID(String value) { this.verticalID = value; }

    @JsonProperty("normalized_query")
    public String getNormalizedQuery() { return normalizedQuery; }
    @JsonProperty("normalized_query")
    public void setNormalizedQuery(String value) { this.normalizedQuery = value; }

    @JsonProperty("original_query")
    public String getOriginalQuery() { return originalQuery; }
    @JsonProperty("original_query")
    public void setOriginalQuery(String value) { this.originalQuery = value; }

    @JsonProperty("rewritten_query")
    public String getRewrittenQuery() { return rewrittenQuery; }
    @JsonProperty("rewritten_query")
    public void setRewrittenQuery(String value) { this.rewrittenQuery = value; }

    @JsonProperty("specificity")
    public String getSpecificity() { return specificity; }
    @JsonProperty("specificity")
    public void setSpecificity(String value) { this.specificity = value; }

    @JsonProperty("top_query_cat_path")
    public String getTopQueryCatPath() { return topQueryCatPath; }
    @JsonProperty("top_query_cat_path")
    public void setTopQueryCatPath(String value) { this.topQueryCatPath = value; }

    @JsonProperty("top_query_cat_path_name")
    public String getTopQueryCatPathName() { return topQueryCatPathName; }
    @JsonProperty("top_query_cat_path_name")
    public void setTopQueryCatPathName(String value) { this.topQueryCatPathName = value; }

    @JsonProperty("product_type")
    public ProductType[] getProductType() { return productType; }
    @JsonProperty("product_type")
    public void setProductType(ProductType[] value) { this.productType = value; }

    @JsonProperty("analytics_log")
    public AnalyticsLog getAnalyticsLog() { return analyticsLog; }
    @JsonProperty("analytics_log")
    public void setAnalyticsLog(AnalyticsLog value) { this.analyticsLog = value; }
}
