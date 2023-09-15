package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class ZoneV1 {
    private UUID moduleID;
    private String zone;
    private boolean isP13NBtfModule;
    private boolean isNativeLazyLoaded;

    @JsonProperty("moduleId")
    public UUID getModuleID() { return moduleID; }
    @JsonProperty("moduleId")
    public void setModuleID(UUID value) { this.moduleID = value; }

    @JsonProperty("zone")
    public String getZone() { return zone; }
    @JsonProperty("zone")
    public void setZone(String value) { this.zone = value; }

    @JsonProperty("isP13nBtfModule")
    public boolean getIsP13NBtfModule() { return isP13NBtfModule; }
    @JsonProperty("isP13nBtfModule")
    public void setIsP13NBtfModule(boolean value) { this.isP13NBtfModule = value; }

    @JsonProperty("isNativeLazyLoaded")
    public boolean getIsNativeLazyLoaded() { return isNativeLazyLoaded; }
    @JsonProperty("isNativeLazyLoaded")
    public void setIsNativeLazyLoaded(boolean value) { this.isNativeLazyLoaded = value; }
}
