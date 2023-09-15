import com.fasterxml.jackson.annotation.*;

public class AdsContext {
    private LocationContext locationContext;
    private String itemID;
    private String categoryID;
    private String categoryName;
    private String brand;
    private String productName;
    private String productTypeID;
    private String normKeyword;
    private String verticalID;
    private String[] dedupeList;

    @JsonProperty("locationContext")
    public LocationContext getLocationContext() { return locationContext; }
    @JsonProperty("locationContext")
    public void setLocationContext(LocationContext value) { this.locationContext = value; }

    @JsonProperty("itemId")
    public String getItemID() { return itemID; }
    @JsonProperty("itemId")
    public void setItemID(String value) { this.itemID = value; }

    @JsonProperty("categoryId")
    public String getCategoryID() { return categoryID; }
    @JsonProperty("categoryId")
    public void setCategoryID(String value) { this.categoryID = value; }

    @JsonProperty("categoryName")
    public String getCategoryName() { return categoryName; }
    @JsonProperty("categoryName")
    public void setCategoryName(String value) { this.categoryName = value; }

    @JsonProperty("brand")
    public String getBrand() { return brand; }
    @JsonProperty("brand")
    public void setBrand(String value) { this.brand = value; }

    @JsonProperty("productName")
    public String getProductName() { return productName; }
    @JsonProperty("productName")
    public void setProductName(String value) { this.productName = value; }

    @JsonProperty("productTypeId")
    public String getProductTypeID() { return productTypeID; }
    @JsonProperty("productTypeId")
    public void setProductTypeID(String value) { this.productTypeID = value; }

    @JsonProperty("normKeyword")
    public String getNormKeyword() { return normKeyword; }
    @JsonProperty("normKeyword")
    public void setNormKeyword(String value) { this.normKeyword = value; }

    @JsonProperty("verticalId")
    public String getVerticalID() { return verticalID; }
    @JsonProperty("verticalId")
    public void setVerticalID(String value) { this.verticalID = value; }

    @JsonProperty("dedupeList")
    public String[] getDedupeList() { return dedupeList; }
    @JsonProperty("dedupeList")
    public void setDedupeList(String[] value) { this.dedupeList = value; }
}
