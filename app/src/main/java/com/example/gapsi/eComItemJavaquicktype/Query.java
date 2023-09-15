package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Query {
    private String query;
    private String sort;
    private String page;

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("sort")
    public String getSort() { return sort; }
    @JsonProperty("sort")
    public void setSort(String value) { this.sort = value; }

    @JsonProperty("page")
    public String getPage() { return page; }
    @JsonProperty("page")
    public void setPage(String value) { this.page = value; }
}
