import com.fasterxml.jackson.annotation.*;

public class PriceInfo {
    private String itemPrice;
    private String linePrice;
    private String wasPrice;
    private UnitPrice unitPrice;
    private String shipPrice;
    private String minPriceForVariant;
    private String subscriptionPrice;
    private String subscriptionString;
    private String priceDisplayCondition;
    private boolean finalCostByWeight;
    private String submapType;
    private String priceRangeString;
    private String linePriceDisplay;
    private String eaPricingPreText;
    private String memberPriceString;
    private Object subscriptionPercentage;
    private double savingsAmt;
    private double minPrice;
    private String savings;
    private Object subscriptionDualPrice;
    private String eaPricingText;

    @JsonProperty("itemPrice")
    public String getItemPrice() { return itemPrice; }
    @JsonProperty("itemPrice")
    public void setItemPrice(String value) { this.itemPrice = value; }

    @JsonProperty("linePrice")
    public String getLinePrice() { return linePrice; }
    @JsonProperty("linePrice")
    public void setLinePrice(String value) { this.linePrice = value; }

    @JsonProperty("wasPrice")
    public String getWasPrice() { return wasPrice; }
    @JsonProperty("wasPrice")
    public void setWasPrice(String value) { this.wasPrice = value; }

    @JsonProperty("unitPrice")
    public UnitPrice getUnitPrice() { return unitPrice; }
    @JsonProperty("unitPrice")
    public void setUnitPrice(UnitPrice value) { this.unitPrice = value; }

    @JsonProperty("shipPrice")
    public String getShipPrice() { return shipPrice; }
    @JsonProperty("shipPrice")
    public void setShipPrice(String value) { this.shipPrice = value; }

    @JsonProperty("minPriceForVariant")
    public String getMinPriceForVariant() { return minPriceForVariant; }
    @JsonProperty("minPriceForVariant")
    public void setMinPriceForVariant(String value) { this.minPriceForVariant = value; }

    @JsonProperty("subscriptionPrice")
    public String getSubscriptionPrice() { return subscriptionPrice; }
    @JsonProperty("subscriptionPrice")
    public void setSubscriptionPrice(String value) { this.subscriptionPrice = value; }

    @JsonProperty("subscriptionString")
    public String getSubscriptionString() { return subscriptionString; }
    @JsonProperty("subscriptionString")
    public void setSubscriptionString(String value) { this.subscriptionString = value; }

    @JsonProperty("priceDisplayCondition")
    public String getPriceDisplayCondition() { return priceDisplayCondition; }
    @JsonProperty("priceDisplayCondition")
    public void setPriceDisplayCondition(String value) { this.priceDisplayCondition = value; }

    @JsonProperty("finalCostByWeight")
    public boolean getFinalCostByWeight() { return finalCostByWeight; }
    @JsonProperty("finalCostByWeight")
    public void setFinalCostByWeight(boolean value) { this.finalCostByWeight = value; }

    @JsonProperty("submapType")
    public String getSubmapType() { return submapType; }
    @JsonProperty("submapType")
    public void setSubmapType(String value) { this.submapType = value; }

    @JsonProperty("priceRangeString")
    public String getPriceRangeString() { return priceRangeString; }
    @JsonProperty("priceRangeString")
    public void setPriceRangeString(String value) { this.priceRangeString = value; }

    @JsonProperty("linePriceDisplay")
    public String getLinePriceDisplay() { return linePriceDisplay; }
    @JsonProperty("linePriceDisplay")
    public void setLinePriceDisplay(String value) { this.linePriceDisplay = value; }

    @JsonProperty("eaPricingPreText")
    public String getEaPricingPreText() { return eaPricingPreText; }
    @JsonProperty("eaPricingPreText")
    public void setEaPricingPreText(String value) { this.eaPricingPreText = value; }

    @JsonProperty("memberPriceString")
    public String getMemberPriceString() { return memberPriceString; }
    @JsonProperty("memberPriceString")
    public void setMemberPriceString(String value) { this.memberPriceString = value; }

    @JsonProperty("subscriptionPercentage")
    public Object getSubscriptionPercentage() { return subscriptionPercentage; }
    @JsonProperty("subscriptionPercentage")
    public void setSubscriptionPercentage(Object value) { this.subscriptionPercentage = value; }

    @JsonProperty("savingsAmt")
    public double getSavingsAmt() { return savingsAmt; }
    @JsonProperty("savingsAmt")
    public void setSavingsAmt(double value) { this.savingsAmt = value; }

    @JsonProperty("minPrice")
    public double getMinPrice() { return minPrice; }
    @JsonProperty("minPrice")
    public void setMinPrice(double value) { this.minPrice = value; }

    @JsonProperty("savings")
    public String getSavings() { return savings; }
    @JsonProperty("savings")
    public void setSavings(String value) { this.savings = value; }

    @JsonProperty("subscriptionDualPrice")
    public Object getSubscriptionDualPrice() { return subscriptionDualPrice; }
    @JsonProperty("subscriptionDualPrice")
    public void setSubscriptionDualPrice(Object value) { this.subscriptionDualPrice = value; }

    @JsonProperty("eaPricingText")
    public String getEaPricingText() { return eaPricingText; }
    @JsonProperty("eaPricingText")
    public void setEaPricingText(String value) { this.eaPricingText = value; }
}
