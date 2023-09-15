package com.example.gapsi.eComItemJavaquicktype;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad {
    private String status;
    private String moduleType;
    private String platform;
    private String pageID;
    private String pageType;
    private String storeID;
    private String stateCode;
    private String zipCode;
    private PageContext pageContext;
    private Configs moduleConfigs;
    private AdsContext adsContext;
    private AdRequestComposite adRequestComposite;
    private AdContent adContent;

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("moduleType")
    public String getModuleType() { return moduleType; }
    @JsonProperty("moduleType")
    public void setModuleType(String value) { this.moduleType = value; }

    @JsonProperty("platform")
    public String getPlatform() { return platform; }
    @JsonProperty("platform")
    public void setPlatform(String value) { this.platform = value; }

    @JsonProperty("pageId")
    public String getPageID() { return pageID; }
    @JsonProperty("pageId")
    public void setPageID(String value) { this.pageID = value; }

    @JsonProperty("pageType")
    public String getPageType() { return pageType; }
    @JsonProperty("pageType")
    public void setPageType(String value) { this.pageType = value; }

    @JsonProperty("storeId")
    public String getStoreID() { return storeID; }
    @JsonProperty("storeId")
    public void setStoreID(String value) { this.storeID = value; }

    @JsonProperty("stateCode")
    public String getStateCode() { return stateCode; }
    @JsonProperty("stateCode")
    public void setStateCode(String value) { this.stateCode = value; }

    @JsonProperty("zipCode")
    public String getZipCode() { return zipCode; }
    @JsonProperty("zipCode")
    public void setZipCode(String value) { this.zipCode = value; }

    @JsonProperty("pageContext")
    public PageContext getPageContext() { return pageContext; }
    @JsonProperty("pageContext")
    public void setPageContext(PageContext value) { this.pageContext = value; }

    @JsonProperty("moduleConfigs")
    public Configs getModuleConfigs() { return moduleConfigs; }
    @JsonProperty("moduleConfigs")
    public void setModuleConfigs(Configs value) { this.moduleConfigs = value; }

    @JsonProperty("adsContext")
    public AdsContext getAdsContext() { return adsContext; }
    @JsonProperty("adsContext")
    public void setAdsContext(AdsContext value) { this.adsContext = value; }

    @JsonProperty("adRequestComposite")
    public AdRequestComposite getAdRequestComposite() { return adRequestComposite; }
    @JsonProperty("adRequestComposite")
    public void setAdRequestComposite(AdRequestComposite value) { this.adRequestComposite = value; }

    @JsonProperty("adContent")
    public AdContent getAdContent() { return adContent; }
    @JsonProperty("adContent")
    public void setAdContent(AdContent value) { this.adContent = value; }
}
