package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class BrowsingHistoryZoneConfigs {
    private String typename;
    private Object title;
    private Object[] products;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("title")
    public Object getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(Object value) { this.title = value; }

    @JsonProperty("products")
    public Object[] getProducts() { return products; }
    @JsonProperty("products")
    public void setProducts(Object[] value) { this.products = value; }
}
