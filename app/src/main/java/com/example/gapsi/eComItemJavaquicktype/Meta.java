package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Meta {
    private AdsBeacon adsBeacon;
    private String query;
    private long stackID;
    private String stackType;
    private String title;
    private String layoutEnum;
    private long totalItemCount;
    private String totalItemCountDisplay;
    private Object borderColor;
    private boolean isPartialResult;
    private Object subTitle;
    private Object queryUsedForSearchResults;
    private Object stackName;
    private Object iconURL;
    private Object titleKey;
    private Object spBeaconInfo;

    @JsonProperty("adsBeacon")
    public AdsBeacon getAdsBeacon() { return adsBeacon; }
    @JsonProperty("adsBeacon")
    public void setAdsBeacon(AdsBeacon value) { this.adsBeacon = value; }

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("stackId")
    public long getStackID() { return stackID; }
    @JsonProperty("stackId")
    public void setStackID(long value) { this.stackID = value; }

    @JsonProperty("stackType")
    public String getStackType() { return stackType; }
    @JsonProperty("stackType")
    public void setStackType(String value) { this.stackType = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("layoutEnum")
    public String getLayoutEnum() { return layoutEnum; }
    @JsonProperty("layoutEnum")
    public void setLayoutEnum(String value) { this.layoutEnum = value; }

    @JsonProperty("totalItemCount")
    public long getTotalItemCount() { return totalItemCount; }
    @JsonProperty("totalItemCount")
    public void setTotalItemCount(long value) { this.totalItemCount = value; }

    @JsonProperty("totalItemCountDisplay")
    public String getTotalItemCountDisplay() { return totalItemCountDisplay; }
    @JsonProperty("totalItemCountDisplay")
    public void setTotalItemCountDisplay(String value) { this.totalItemCountDisplay = value; }

    @JsonProperty("borderColor")
    public Object getBorderColor() { return borderColor; }
    @JsonProperty("borderColor")
    public void setBorderColor(Object value) { this.borderColor = value; }

    @JsonProperty("isPartialResult")
    public boolean getIsPartialResult() { return isPartialResult; }
    @JsonProperty("isPartialResult")
    public void setIsPartialResult(boolean value) { this.isPartialResult = value; }

    @JsonProperty("subTitle")
    public Object getSubTitle() { return subTitle; }
    @JsonProperty("subTitle")
    public void setSubTitle(Object value) { this.subTitle = value; }

    @JsonProperty("queryUsedForSearchResults")
    public Object getQueryUsedForSearchResults() { return queryUsedForSearchResults; }
    @JsonProperty("queryUsedForSearchResults")
    public void setQueryUsedForSearchResults(Object value) { this.queryUsedForSearchResults = value; }

    @JsonProperty("stackName")
    public Object getStackName() { return stackName; }
    @JsonProperty("stackName")
    public void setStackName(Object value) { this.stackName = value; }

    @JsonProperty("iconUrl")
    public Object getIconURL() { return iconURL; }
    @JsonProperty("iconUrl")
    public void setIconURL(Object value) { this.iconURL = value; }

    @JsonProperty("titleKey")
    public Object getTitleKey() { return titleKey; }
    @JsonProperty("titleKey")
    public void setTitleKey(Object value) { this.titleKey = value; }

    @JsonProperty("spBeaconInfo")
    public Object getSPBeaconInfo() { return spBeaconInfo; }
    @JsonProperty("spBeaconInfo")
    public void setSPBeaconInfo(Object value) { this.spBeaconInfo = value; }
}
