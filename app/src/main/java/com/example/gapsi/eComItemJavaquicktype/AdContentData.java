package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class AdContentData {
    private String typename;
    private UUID adUUID;
    private Object adExpInfo;
    private String moduleInfo;
    private Object[] brands;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("adUuid")
    public UUID getAdUUID() { return adUUID; }
    @JsonProperty("adUuid")
    public void setAdUUID(UUID value) { this.adUUID = value; }

    @JsonProperty("adExpInfo")
    public Object getAdExpInfo() { return adExpInfo; }
    @JsonProperty("adExpInfo")
    public void setAdExpInfo(Object value) { this.adExpInfo = value; }

    @JsonProperty("moduleInfo")
    public String getModuleInfo() { return moduleInfo; }
    @JsonProperty("moduleInfo")
    public void setModuleInfo(String value) { this.moduleInfo = value; }

    @JsonProperty("brands")
    public Object[] getBrands() { return brands; }
    @JsonProperty("brands")
    public void setBrands(Object[] value) { this.brands = value; }
}
