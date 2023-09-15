import com.fasterxml.jackson.annotation.*;

public class TopZone2Configs {
    private String typename;
    private Configs rawConfigs;
    private String moduleLocation;
    private Ad ad;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("_rawConfigs")
    public Configs getRawConfigs() { return rawConfigs; }
    @JsonProperty("_rawConfigs")
    public void setRawConfigs(Configs value) { this.rawConfigs = value; }

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }

    @JsonProperty("ad")
    public Ad getAd() { return ad; }
    @JsonProperty("ad")
    public void setAd(Ad value) { this.ad = value; }
}
