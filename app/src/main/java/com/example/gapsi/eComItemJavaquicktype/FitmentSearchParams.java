package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FitmentSearchParams {
    private String id;
    private String dealsID;
    private String query;
    private long page;
    private String prg;
    private String facet;
    private String sort;
    private String rawFacet;
    private String seoPath;
    private long ps;
    private String ptss;
    private String trsp;
    private String recallSet;
    private String moduleSearch;
    private String minPrice;
    private String maxPrice;
    private String storeSlotBooked;
    private String fitmentSearchParamsCatID;
    private String beShelfID;
    private String catID;
    private long limit;
    private String fitmentSearchParamsBeShelfID;
    private SearchArgs searchArgs;
    private AdditionalQueryParams additionalQueryParams;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("dealsId")
    public String getDealsID() { return dealsID; }
    @JsonProperty("dealsId")
    public void setDealsID(String value) { this.dealsID = value; }

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("page")
    public long getPage() { return page; }
    @JsonProperty("page")
    public void setPage(long value) { this.page = value; }

    @JsonProperty("prg")
    public String getPrg() { return prg; }
    @JsonProperty("prg")
    public void setPrg(String value) { this.prg = value; }

    @JsonProperty("facet")
    public String getFacet() { return facet; }
    @JsonProperty("facet")
    public void setFacet(String value) { this.facet = value; }

    @JsonProperty("sort")
    public String getSort() { return sort; }
    @JsonProperty("sort")
    public void setSort(String value) { this.sort = value; }

    @JsonProperty("rawFacet")
    public String getRawFacet() { return rawFacet; }
    @JsonProperty("rawFacet")
    public void setRawFacet(String value) { this.rawFacet = value; }

    @JsonProperty("seoPath")
    public String getSEOPath() { return seoPath; }
    @JsonProperty("seoPath")
    public void setSEOPath(String value) { this.seoPath = value; }

    @JsonProperty("ps")
    public long getPS() { return ps; }
    @JsonProperty("ps")
    public void setPS(long value) { this.ps = value; }

    @JsonProperty("ptss")
    public String getPtss() { return ptss; }
    @JsonProperty("ptss")
    public void setPtss(String value) { this.ptss = value; }

    @JsonProperty("trsp")
    public String getTrsp() { return trsp; }
    @JsonProperty("trsp")
    public void setTrsp(String value) { this.trsp = value; }

    @JsonProperty("recall_set")
    public String getRecallSet() { return recallSet; }
    @JsonProperty("recall_set")
    public void setRecallSet(String value) { this.recallSet = value; }

    @JsonProperty("module_search")
    public String getModuleSearch() { return moduleSearch; }
    @JsonProperty("module_search")
    public void setModuleSearch(String value) { this.moduleSearch = value; }

    @JsonProperty("min_price")
    public String getMinPrice() { return minPrice; }
    @JsonProperty("min_price")
    public void setMinPrice(String value) { this.minPrice = value; }

    @JsonProperty("max_price")
    public String getMaxPrice() { return maxPrice; }
    @JsonProperty("max_price")
    public void setMaxPrice(String value) { this.maxPrice = value; }

    @JsonProperty("storeSlotBooked")
    public String getStoreSlotBooked() { return storeSlotBooked; }
    @JsonProperty("storeSlotBooked")
    public void setStoreSlotBooked(String value) { this.storeSlotBooked = value; }

    @JsonProperty("cat_id")
    public String getFitmentSearchParamsCatID() { return fitmentSearchParamsCatID; }
    @JsonProperty("cat_id")
    public void setFitmentSearchParamsCatID(String value) { this.fitmentSearchParamsCatID = value; }

    @JsonProperty("_be_shelf_id")
    public String getBeShelfID() { return beShelfID; }
    @JsonProperty("_be_shelf_id")
    public void setBeShelfID(String value) { this.beShelfID = value; }

    @JsonProperty("catId")
    public String getCatID() { return catID; }
    @JsonProperty("catId")
    public void setCatID(String value) { this.catID = value; }

    @JsonProperty("limit")
    public long getLimit() { return limit; }
    @JsonProperty("limit")
    public void setLimit(long value) { this.limit = value; }

    @JsonProperty("beShelfId")
    public String getFitmentSearchParamsBeShelfID() { return fitmentSearchParamsBeShelfID; }
    @JsonProperty("beShelfId")
    public void setFitmentSearchParamsBeShelfID(String value) { this.fitmentSearchParamsBeShelfID = value; }

    @JsonProperty("searchArgs")
    public SearchArgs getSearchArgs() { return searchArgs; }
    @JsonProperty("searchArgs")
    public void setSearchArgs(SearchArgs value) { this.searchArgs = value; }

    @JsonProperty("additionalQueryParams")
    public AdditionalQueryParams getAdditionalQueryParams() { return additionalQueryParams; }
    @JsonProperty("additionalQueryParams")
    public void setAdditionalQueryParams(AdditionalQueryParams value) { this.additionalQueryParams = value; }
}
