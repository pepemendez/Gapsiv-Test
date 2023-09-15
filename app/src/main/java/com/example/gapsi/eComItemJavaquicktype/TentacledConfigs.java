package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TentacledConfigs {
    private String typename;
    private String moduleSource;
    private PillsV2[] pillsV2;
    private PurpleRawConfigs rawConfigs;
    private Ad ad;
    private Facet[] topNavFacets;
    private Facet[] allSortAndFilterFacets;
    private String moduleLocation;
    private String title;
    private Object[] products;
    private Object fitments;
    private String subTitle;
    private String urlLinkText;
    private String url;
    private ZoneV1[] zoneV1;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("moduleSource")
    public String getModuleSource() { return moduleSource; }
    @JsonProperty("moduleSource")
    public void setModuleSource(String value) { this.moduleSource = value; }

    @JsonProperty("pillsV2")
    public PillsV2[] getPillsV2() { return pillsV2; }
    @JsonProperty("pillsV2")
    public void setPillsV2(PillsV2[] value) { this.pillsV2 = value; }

    @JsonProperty("_rawConfigs")
    public PurpleRawConfigs getRawConfigs() { return rawConfigs; }
    @JsonProperty("_rawConfigs")
    public void setRawConfigs(PurpleRawConfigs value) { this.rawConfigs = value; }

    @JsonProperty("ad")
    public Ad getAd() { return ad; }
    @JsonProperty("ad")
    public void setAd(Ad value) { this.ad = value; }

    @JsonProperty("topNavFacets")
    public Facet[] getTopNavFacets() { return topNavFacets; }
    @JsonProperty("topNavFacets")
    public void setTopNavFacets(Facet[] value) { this.topNavFacets = value; }

    @JsonProperty("allSortAndFilterFacets")
    public Facet[] getAllSortAndFilterFacets() { return allSortAndFilterFacets; }
    @JsonProperty("allSortAndFilterFacets")
    public void setAllSortAndFilterFacets(Facet[] value) { this.allSortAndFilterFacets = value; }

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("products")
    public Object[] getProducts() { return products; }
    @JsonProperty("products")
    public void setProducts(Object[] value) { this.products = value; }

    @JsonProperty("fitments")
    public Object getFitments() { return fitments; }
    @JsonProperty("fitments")
    public void setFitments(Object value) { this.fitments = value; }

    @JsonProperty("subTitle")
    public String getSubTitle() { return subTitle; }
    @JsonProperty("subTitle")
    public void setSubTitle(String value) { this.subTitle = value; }

    @JsonProperty("urlLinkText")
    public String getURLLinkText() { return urlLinkText; }
    @JsonProperty("urlLinkText")
    public void setURLLinkText(String value) { this.urlLinkText = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("zoneV1")
    public ZoneV1[] getZoneV1() { return zoneV1; }
    @JsonProperty("zoneV1")
    public void setZoneV1(ZoneV1[] value) { this.zoneV1 = value; }
}
