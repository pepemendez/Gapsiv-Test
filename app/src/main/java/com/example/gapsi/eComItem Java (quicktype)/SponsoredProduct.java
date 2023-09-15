import com.fasterxml.jackson.annotation.*;

public class SponsoredProduct {
    private String spQs;
    private String clickBeacon;
    private Object spTags;
    private Object viewBeacon;

    @JsonProperty("spQs")
    public String getSPQs() { return spQs; }
    @JsonProperty("spQs")
    public void setSPQs(String value) { this.spQs = value; }

    @JsonProperty("clickBeacon")
    public String getClickBeacon() { return clickBeacon; }
    @JsonProperty("clickBeacon")
    public void setClickBeacon(String value) { this.clickBeacon = value; }

    @JsonProperty("spTags")
    public Object getSPTags() { return spTags; }
    @JsonProperty("spTags")
    public void setSPTags(Object value) { this.spTags = value; }

    @JsonProperty("viewBeacon")
    public Object getViewBeacon() { return viewBeacon; }
    @JsonProperty("viewBeacon")
    public void setViewBeacon(Object value) { this.viewBeacon = value; }
}
