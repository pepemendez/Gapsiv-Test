package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ItemVariantList {
    private String name;
    private String swatchImageURL;
    private String image;
    private String productID;
    private String usItemID;
    private String canonicalURL;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("swatchImageUrl")
    public String getSwatchImageURL() { return swatchImageURL; }
    @JsonProperty("swatchImageUrl")
    public void setSwatchImageURL(String value) { this.swatchImageURL = value; }

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("productId")
    public String getProductID() { return productID; }
    @JsonProperty("productId")
    public void setProductID(String value) { this.productID = value; }

    @JsonProperty("usItemId")
    public String getUsItemID() { return usItemID; }
    @JsonProperty("usItemId")
    public void setUsItemID(String value) { this.usItemID = value; }

    @JsonProperty("canonicalUrl")
    public String getCanonicalURL() { return canonicalURL; }
    @JsonProperty("canonicalUrl")
    public void setCanonicalURL(String value) { this.canonicalURL = value; }
}
