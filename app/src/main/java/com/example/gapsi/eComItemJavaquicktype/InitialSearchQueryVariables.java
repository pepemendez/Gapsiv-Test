package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class InitialSearchQueryVariables {
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
    private String beShelfID;
    private String recallSet;
    private String moduleSearch;
    private String minPrice;
    private String maxPrice;
    private String storeSlotBooked;
    private FitmentFieldParams fitmentFieldParams;
    private FitmentSearchParams fitmentSearchParams;
    private boolean fetchMarquee;
    private boolean fetchSkyline;
    private boolean fetchSbaTop;
    private boolean fetchGallery;
    private boolean enableFashionTopNav;
    private boolean enableFlattenedFitment;
    private boolean enableMultiSave;
    private boolean fetchDAC;
    private boolean enableFacetCount;
    private String catID;
    private long limit;
    private boolean enableRelatedSearches;
    private SearchArgs searchArgs;
    private boolean enablePortableFacets;
    private AdditionalQueryParams additionalQueryParams;
    private String tenant;

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

    @JsonProperty("beShelfId")
    public String getBeShelfID() { return beShelfID; }
    @JsonProperty("beShelfId")
    public void setBeShelfID(String value) { this.beShelfID = value; }

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

    @JsonProperty("fitmentFieldParams")
    public FitmentFieldParams getFitmentFieldParams() { return fitmentFieldParams; }
    @JsonProperty("fitmentFieldParams")
    public void setFitmentFieldParams(FitmentFieldParams value) { this.fitmentFieldParams = value; }

    @JsonProperty("fitmentSearchParams")
    public FitmentSearchParams getFitmentSearchParams() { return fitmentSearchParams; }
    @JsonProperty("fitmentSearchParams")
    public void setFitmentSearchParams(FitmentSearchParams value) { this.fitmentSearchParams = value; }

    @JsonProperty("fetchMarquee")
    public boolean getFetchMarquee() { return fetchMarquee; }
    @JsonProperty("fetchMarquee")
    public void setFetchMarquee(boolean value) { this.fetchMarquee = value; }

    @JsonProperty("fetchSkyline")
    public boolean getFetchSkyline() { return fetchSkyline; }
    @JsonProperty("fetchSkyline")
    public void setFetchSkyline(boolean value) { this.fetchSkyline = value; }

    @JsonProperty("fetchSbaTop")
    public boolean getFetchSbaTop() { return fetchSbaTop; }
    @JsonProperty("fetchSbaTop")
    public void setFetchSbaTop(boolean value) { this.fetchSbaTop = value; }

    @JsonProperty("fetchGallery")
    public boolean getFetchGallery() { return fetchGallery; }
    @JsonProperty("fetchGallery")
    public void setFetchGallery(boolean value) { this.fetchGallery = value; }

    @JsonProperty("enableFashionTopNav")
    public boolean getEnableFashionTopNav() { return enableFashionTopNav; }
    @JsonProperty("enableFashionTopNav")
    public void setEnableFashionTopNav(boolean value) { this.enableFashionTopNav = value; }

    @JsonProperty("enableFlattenedFitment")
    public boolean getEnableFlattenedFitment() { return enableFlattenedFitment; }
    @JsonProperty("enableFlattenedFitment")
    public void setEnableFlattenedFitment(boolean value) { this.enableFlattenedFitment = value; }

    @JsonProperty("enableMultiSave")
    public boolean getEnableMultiSave() { return enableMultiSave; }
    @JsonProperty("enableMultiSave")
    public void setEnableMultiSave(boolean value) { this.enableMultiSave = value; }

    @JsonProperty("fetchDac")
    public boolean getFetchDAC() { return fetchDAC; }
    @JsonProperty("fetchDac")
    public void setFetchDAC(boolean value) { this.fetchDAC = value; }

    @JsonProperty("enableFacetCount")
    public boolean getEnableFacetCount() { return enableFacetCount; }
    @JsonProperty("enableFacetCount")
    public void setEnableFacetCount(boolean value) { this.enableFacetCount = value; }

    @JsonProperty("catId")
    public String getCatID() { return catID; }
    @JsonProperty("catId")
    public void setCatID(String value) { this.catID = value; }

    @JsonProperty("limit")
    public long getLimit() { return limit; }
    @JsonProperty("limit")
    public void setLimit(long value) { this.limit = value; }

    @JsonProperty("enableRelatedSearches")
    public boolean getEnableRelatedSearches() { return enableRelatedSearches; }
    @JsonProperty("enableRelatedSearches")
    public void setEnableRelatedSearches(boolean value) { this.enableRelatedSearches = value; }

    @JsonProperty("searchArgs")
    public SearchArgs getSearchArgs() { return searchArgs; }
    @JsonProperty("searchArgs")
    public void setSearchArgs(SearchArgs value) { this.searchArgs = value; }

    @JsonProperty("enablePortableFacets")
    public boolean getEnablePortableFacets() { return enablePortableFacets; }
    @JsonProperty("enablePortableFacets")
    public void setEnablePortableFacets(boolean value) { this.enablePortableFacets = value; }

    @JsonProperty("additionalQueryParams")
    public AdditionalQueryParams getAdditionalQueryParams() { return additionalQueryParams; }
    @JsonProperty("additionalQueryParams")
    public void setAdditionalQueryParams(AdditionalQueryParams value) { this.additionalQueryParams = value; }

    @JsonProperty("tenant")
    public String getTenant() { return tenant; }
    @JsonProperty("tenant")
    public void setTenant(String value) { this.tenant = value; }
}
