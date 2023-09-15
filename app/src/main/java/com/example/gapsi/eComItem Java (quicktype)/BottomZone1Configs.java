import com.fasterxml.jackson.annotation.*;

public class BottomZone1Configs {
    private String typename;
    private FluffyRawConfigs rawConfigs;
    private Object ad;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("_rawConfigs")
    public FluffyRawConfigs getRawConfigs() { return rawConfigs; }
    @JsonProperty("_rawConfigs")
    public void setRawConfigs(FluffyRawConfigs value) { this.rawConfigs = value; }

    @JsonProperty("ad")
    public Object getAd() { return ad; }
    @JsonProperty("ad")
    public void setAd(Object value) { this.ad = value; }
}
