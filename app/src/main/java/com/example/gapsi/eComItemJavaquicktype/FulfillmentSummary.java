package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class FulfillmentSummary {
    private String storeID;
    private OffsetDateTime deliveryDate;

    @JsonProperty("storeId")
    public String getStoreID() { return storeID; }
    @JsonProperty("storeId")
    public void setStoreID(String value) { this.storeID = value; }

    @JsonProperty("deliveryDate")
    public OffsetDateTime getDeliveryDate() { return deliveryDate; }
    @JsonProperty("deliveryDate")
    public void setDeliveryDate(OffsetDateTime value) { this.deliveryDate = value; }
}
