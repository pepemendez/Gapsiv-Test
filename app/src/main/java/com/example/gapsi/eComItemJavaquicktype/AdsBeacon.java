package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class AdsBeacon {
    private UUID adUUID;
    private String moduleInfo;
    private long maxAds;

    @JsonProperty("adUuid")
    public UUID getAdUUID() { return adUUID; }
    @JsonProperty("adUuid")
    public void setAdUUID(UUID value) { this.adUUID = value; }

    @JsonProperty("moduleInfo")
    public String getModuleInfo() { return moduleInfo; }
    @JsonProperty("moduleInfo")
    public void setModuleInfo(String value) { this.moduleInfo = value; }

    @JsonProperty("max_ads")
    public long getMaxAds() { return maxAds; }
    @JsonProperty("max_ads")
    public void setMaxAds(long value) { this.maxAds = value; }
}
