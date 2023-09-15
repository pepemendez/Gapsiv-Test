import com.fasterxml.jackson.annotation.*;

public class GqlEndpointsByName {
    private String ceaccount;
    private String cecxo;
    private String cecph;
    private String adsgateway;
    private String aroundme;
    private String ceorders;
    private String cegateway;
    private String cepdp;
    private String wellness;
    private String cereturns;

    @JsonProperty("ceaccount")
    public String getCeaccount() { return ceaccount; }
    @JsonProperty("ceaccount")
    public void setCeaccount(String value) { this.ceaccount = value; }

    @JsonProperty("cecxo")
    public String getCecxo() { return cecxo; }
    @JsonProperty("cecxo")
    public void setCecxo(String value) { this.cecxo = value; }

    @JsonProperty("cecph")
    public String getCecph() { return cecph; }
    @JsonProperty("cecph")
    public void setCecph(String value) { this.cecph = value; }

    @JsonProperty("adsgateway")
    public String getAdsgateway() { return adsgateway; }
    @JsonProperty("adsgateway")
    public void setAdsgateway(String value) { this.adsgateway = value; }

    @JsonProperty("aroundme")
    public String getAroundme() { return aroundme; }
    @JsonProperty("aroundme")
    public void setAroundme(String value) { this.aroundme = value; }

    @JsonProperty("ceorders")
    public String getCeorders() { return ceorders; }
    @JsonProperty("ceorders")
    public void setCeorders(String value) { this.ceorders = value; }

    @JsonProperty("cegateway")
    public String getCegateway() { return cegateway; }
    @JsonProperty("cegateway")
    public void setCegateway(String value) { this.cegateway = value; }

    @JsonProperty("cepdp")
    public String getCepdp() { return cepdp; }
    @JsonProperty("cepdp")
    public void setCepdp(String value) { this.cepdp = value; }

    @JsonProperty("wellness")
    public String getWellness() { return wellness; }
    @JsonProperty("wellness")
    public void setWellness(String value) { this.wellness = value; }

    @JsonProperty("cereturns")
    public String getCereturns() { return cereturns; }
    @JsonProperty("cereturns")
    public void setCereturns(String value) { this.cereturns = value; }
}
