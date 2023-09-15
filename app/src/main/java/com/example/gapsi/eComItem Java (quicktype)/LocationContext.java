import com.fasterxml.jackson.annotation.*;

public class LocationContext {
    private String zipCode;
    private String stateCode;
    private String storeID;
    private String pickupStore;
    private String deliveryStore;
    private String intent;
    private boolean incatchment;

    @JsonProperty("zipCode")
    public String getZipCode() { return zipCode; }
    @JsonProperty("zipCode")
    public void setZipCode(String value) { this.zipCode = value; }

    @JsonProperty("stateCode")
    public String getStateCode() { return stateCode; }
    @JsonProperty("stateCode")
    public void setStateCode(String value) { this.stateCode = value; }

    @JsonProperty("storeId")
    public String getStoreID() { return storeID; }
    @JsonProperty("storeId")
    public void setStoreID(String value) { this.storeID = value; }

    @JsonProperty("pickupStore")
    public String getPickupStore() { return pickupStore; }
    @JsonProperty("pickupStore")
    public void setPickupStore(String value) { this.pickupStore = value; }

    @JsonProperty("deliveryStore")
    public String getDeliveryStore() { return deliveryStore; }
    @JsonProperty("deliveryStore")
    public void setDeliveryStore(String value) { this.deliveryStore = value; }

    @JsonProperty("intent")
    public String getIntent() { return intent; }
    @JsonProperty("intent")
    public void setIntent(String value) { this.intent = value; }

    @JsonProperty("incatchment")
    public boolean getIncatchment() { return incatchment; }
    @JsonProperty("incatchment")
    public void setIncatchment(boolean value) { this.incatchment = value; }
}
