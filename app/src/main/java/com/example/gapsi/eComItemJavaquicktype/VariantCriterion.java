package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class VariantCriterion {
    private String name;
    private String type;
    private Object id;
    private String displayName;
    private boolean isVariantTypeSwatch;
    private VariantCriterionVariantList[] variantList;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("id")
    public Object getID() { return id; }
    @JsonProperty("id")
    public void setID(Object value) { this.id = value; }

    @JsonProperty("displayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("displayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("isVariantTypeSwatch")
    public boolean getIsVariantTypeSwatch() { return isVariantTypeSwatch; }
    @JsonProperty("isVariantTypeSwatch")
    public void setIsVariantTypeSwatch(boolean value) { this.isVariantTypeSwatch = value; }

    @JsonProperty("variantList")
    public VariantCriterionVariantList[] getVariantList() { return variantList; }
    @JsonProperty("variantList")
    public void setVariantList(VariantCriterionVariantList[] value) { this.variantList = value; }
}
