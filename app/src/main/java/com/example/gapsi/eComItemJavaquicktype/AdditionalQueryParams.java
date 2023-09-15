package com.example.gapsi.eComItemJavaquicktype;
import com.fasterxml.jackson.annotation.*;

public class AdditionalQueryParams {
    private Object hiddenFacet;
    private Object translation;
    private boolean isMoreOptionsTileEnabled;

    @JsonProperty("hidden_facet")
    public Object getHiddenFacet() { return hiddenFacet; }
    @JsonProperty("hidden_facet")
    public void setHiddenFacet(Object value) { this.hiddenFacet = value; }

    @JsonProperty("translation")
    public Object getTranslation() { return translation; }
    @JsonProperty("translation")
    public void setTranslation(Object value) { this.translation = value; }

    @JsonProperty("isMoreOptionsTileEnabled")
    public boolean getIsMoreOptionsTileEnabled() { return isMoreOptionsTileEnabled; }
    @JsonProperty("isMoreOptionsTileEnabled")
    public void setIsMoreOptionsTileEnabled(boolean value) { this.isMoreOptionsTileEnabled = value; }
}
