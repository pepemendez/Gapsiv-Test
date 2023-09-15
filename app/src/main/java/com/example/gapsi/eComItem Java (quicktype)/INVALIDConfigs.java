import com.fasterxml.jackson.annotation.*;

public class INVALIDConfigs {
    private String typename;
    private ZoneV1[] zoneV1;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("zoneV1")
    public ZoneV1[] getZoneV1() { return zoneV1; }
    @JsonProperty("zoneV1")
    public void setZoneV1(ZoneV1[] value) { this.zoneV1 = value; }
}
