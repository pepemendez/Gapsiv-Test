package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class FluffyLocation {
    private String addressID;

    @JsonProperty("addressId")
    public String getAddressID() { return addressID; }
    @JsonProperty("addressId")
    public void setAddressID(String value) { this.addressID = value; }
}
