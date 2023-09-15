import com.fasterxml.jackson.annotation.*;

public class MatchedTrigger {
    private String zone;

    @JsonProperty("zone")
    public String getZone() { return zone; }
    @JsonProperty("zone")
    public void setZone(String value) { this.zone = value; }
}
