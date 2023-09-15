package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FluffyConfigs {
    private SubCategory[] subCategory;

    @JsonProperty("subCategory")
    public SubCategory[] getSubCategory() { return subCategory; }
    @JsonProperty("subCategory")
    public void setSubCategory(SubCategory[] value) { this.subCategory = value; }
}
