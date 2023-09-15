package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class EndpointMappings {
    private Operations operations;
    private QueryStrings queryStrings;
    private Map<String, MutationCancelOrder> pages;

    @JsonProperty("operations")
    public Operations getOperations() { return operations; }
    @JsonProperty("operations")
    public void setOperations(Operations value) { this.operations = value; }

    @JsonProperty("queryStrings")
    public QueryStrings getQueryStrings() { return queryStrings; }
    @JsonProperty("queryStrings")
    public void setQueryStrings(QueryStrings value) { this.queryStrings = value; }

    @JsonProperty("pages")
    public Map<String, MutationCancelOrder> getPages() { return pages; }
    @JsonProperty("pages")
    public void setPages(Map<String, MutationCancelOrder> value) { this.pages = value; }
}
