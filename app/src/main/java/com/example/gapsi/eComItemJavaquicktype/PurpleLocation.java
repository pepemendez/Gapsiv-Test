package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PurpleLocation {
    private String pickupStore;
    private String deliveryStore;
    private String intent;
    private String postalCode;
    private String stateOrProvinceCode;
    private String city;
    private String storeID;
    private Object accessPointID;
    private Object accessType;
    private Object spokeNodeID;

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

    @JsonProperty("postalCode")
    public String getPostalCode() { return postalCode; }
    @JsonProperty("postalCode")
    public void setPostalCode(String value) { this.postalCode = value; }

    @JsonProperty("stateOrProvinceCode")
    public String getStateOrProvinceCode() { return stateOrProvinceCode; }
    @JsonProperty("stateOrProvinceCode")
    public void setStateOrProvinceCode(String value) { this.stateOrProvinceCode = value; }

    @JsonProperty("city")
    public String getCity() { return city; }
    @JsonProperty("city")
    public void setCity(String value) { this.city = value; }

    @JsonProperty("storeId")
    public String getStoreID() { return storeID; }
    @JsonProperty("storeId")
    public void setStoreID(String value) { this.storeID = value; }

    @JsonProperty("accessPointId")
    public Object getAccessPointID() { return accessPointID; }
    @JsonProperty("accessPointId")
    public void setAccessPointID(Object value) { this.accessPointID = value; }

    @JsonProperty("accessType")
    public Object getAccessType() { return accessType; }
    @JsonProperty("accessType")
    public void setAccessType(Object value) { this.accessType = value; }

    @JsonProperty("spokeNodeId")
    public Object getSpokeNodeID() { return spokeNodeID; }
    @JsonProperty("spokeNodeId")
    public void setSpokeNodeID(Object value) { this.spokeNodeID = value; }
}
