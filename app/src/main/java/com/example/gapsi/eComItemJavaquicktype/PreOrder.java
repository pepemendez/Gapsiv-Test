package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PreOrder {
    private boolean isPreOrder;
    private Object streetDateDisplayable;
    private Object streetDateType;
    private Object streetDate;

    @JsonProperty("isPreOrder")
    public boolean getIsPreOrder() { return isPreOrder; }
    @JsonProperty("isPreOrder")
    public void setIsPreOrder(boolean value) { this.isPreOrder = value; }

    @JsonProperty("streetDateDisplayable")
    public Object getStreetDateDisplayable() { return streetDateDisplayable; }
    @JsonProperty("streetDateDisplayable")
    public void setStreetDateDisplayable(Object value) { this.streetDateDisplayable = value; }

    @JsonProperty("streetDateType")
    public Object getStreetDateType() { return streetDateType; }
    @JsonProperty("streetDateType")
    public void setStreetDateType(Object value) { this.streetDateType = value; }

    @JsonProperty("streetDate")
    public Object getStreetDate() { return streetDate; }
    @JsonProperty("streetDate")
    public void setStreetDate(Object value) { this.streetDate = value; }
}
