package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FitmentFieldParams {
    private boolean powerSportEnabled;
    private boolean dynamicFitmentEnabled;
    private boolean extendedAttributesEnabled;

    @JsonProperty("powerSportEnabled")
    public boolean getPowerSportEnabled() { return powerSportEnabled; }
    @JsonProperty("powerSportEnabled")
    public void setPowerSportEnabled(boolean value) { this.powerSportEnabled = value; }

    @JsonProperty("dynamicFitmentEnabled")
    public boolean getDynamicFitmentEnabled() { return dynamicFitmentEnabled; }
    @JsonProperty("dynamicFitmentEnabled")
    public void setDynamicFitmentEnabled(boolean value) { this.dynamicFitmentEnabled = value; }

    @JsonProperty("extendedAttributesEnabled")
    public boolean getExtendedAttributesEnabled() { return extendedAttributesEnabled; }
    @JsonProperty("extendedAttributesEnabled")
    public void setExtendedAttributesEnabled(boolean value) { this.extendedAttributesEnabled = value; }
}
