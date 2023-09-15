package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Debug {
    private String sisURL;
    private String adsURL;
    private PresoDebugInformation[] presoDebugInformation;

    @JsonProperty("sisUrl")
    public String getSisURL() { return sisURL; }
    @JsonProperty("sisUrl")
    public void setSisURL(String value) { this.sisURL = value; }

    @JsonProperty("adsUrl")
    public String getAdsURL() { return adsURL; }
    @JsonProperty("adsUrl")
    public void setAdsURL(String value) { this.adsURL = value; }

    @JsonProperty("presoDebugInformation")
    public PresoDebugInformation[] getPresoDebugInformation() { return presoDebugInformation; }
    @JsonProperty("presoDebugInformation")
    public void setPresoDebugInformation(PresoDebugInformation[] value) { this.presoDebugInformation = value; }
}
