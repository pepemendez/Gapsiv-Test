package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class VariantCriterionVariantList {
    private Object id;
    private String[] images;
    private String name;
    private long rank;
    private String swatchImageURL;
    private AvailabilityStatus availabilityStatus;
    private String[] products;
    private SelectedProduct selectedProduct;

    @JsonProperty("id")
    public Object getID() { return id; }
    @JsonProperty("id")
    public void setID(Object value) { this.id = value; }

    @JsonProperty("images")
    public String[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(String[] value) { this.images = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("swatchImageUrl")
    public String getSwatchImageURL() { return swatchImageURL; }
    @JsonProperty("swatchImageUrl")
    public void setSwatchImageURL(String value) { this.swatchImageURL = value; }

    @JsonProperty("availabilityStatus")
    public AvailabilityStatus getAvailabilityStatus() { return availabilityStatus; }
    @JsonProperty("availabilityStatus")
    public void setAvailabilityStatus(AvailabilityStatus value) { this.availabilityStatus = value; }

    @JsonProperty("products")
    public String[] getProducts() { return products; }
    @JsonProperty("products")
    public void setProducts(String[] value) { this.products = value; }

    @JsonProperty("selectedProduct")
    public SelectedProduct getSelectedProduct() { return selectedProduct; }
    @JsonProperty("selectedProduct")
    public void setSelectedProduct(SelectedProduct value) { this.selectedProduct = value; }
}
