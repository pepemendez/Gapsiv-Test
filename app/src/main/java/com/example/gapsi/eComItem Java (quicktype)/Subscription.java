import com.fasterxml.jackson.annotation.*;

public class Subscription {
    private SubscriptionTypename typename;
    private boolean subscriptionEligible;

    @JsonProperty("__typename")
    public SubscriptionTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(SubscriptionTypename value) { this.typename = value; }

    @JsonProperty("subscriptionEligible")
    public boolean getSubscriptionEligible() { return subscriptionEligible; }
    @JsonProperty("subscriptionEligible")
    public void setSubscriptionEligible(boolean value) { this.subscriptionEligible = value; }
}
