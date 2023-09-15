import com.fasterxml.jackson.annotation.*;

public class GoogleMaps {
    private String checkAddressAPIKey;
    private String addressAPIKey;
    private String geoCodingAPIKey;
    private RiseMapAPIKey riseMapAPIKey;

    @JsonProperty("checkAddressAPIKey")
    public String getCheckAddressAPIKey() { return checkAddressAPIKey; }
    @JsonProperty("checkAddressAPIKey")
    public void setCheckAddressAPIKey(String value) { this.checkAddressAPIKey = value; }

    @JsonProperty("addressAPIKey")
    public String getAddressAPIKey() { return addressAPIKey; }
    @JsonProperty("addressAPIKey")
    public void setAddressAPIKey(String value) { this.addressAPIKey = value; }

    @JsonProperty("geoCodingAPIKey")
    public String getGeoCodingAPIKey() { return geoCodingAPIKey; }
    @JsonProperty("geoCodingAPIKey")
    public void setGeoCodingAPIKey(String value) { this.geoCodingAPIKey = value; }

    @JsonProperty("riseMapAPIKey")
    public RiseMapAPIKey getRiseMapAPIKey() { return riseMapAPIKey; }
    @JsonProperty("riseMapAPIKey")
    public void setRiseMapAPIKey(RiseMapAPIKey value) { this.riseMapAPIKey = value; }
}
