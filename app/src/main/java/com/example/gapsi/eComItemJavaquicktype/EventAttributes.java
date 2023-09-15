package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class EventAttributes {
    private boolean priceFlip;
    private boolean specialBuy;

    @JsonProperty("priceFlip")
    public boolean getPriceFlip() { return priceFlip; }
    @JsonProperty("priceFlip")
    public void setPriceFlip(boolean value) { this.priceFlip = value; }

    @JsonProperty("specialBuy")
    public boolean getSpecialBuy() { return specialBuy; }
    @JsonProperty("specialBuy")
    public void setSpecialBuy(boolean value) { this.specialBuy = value; }
}
