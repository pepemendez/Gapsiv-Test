import com.fasterxml.jackson.annotation.*;

public class ThreatMetrix {
    private boolean enable;

    @JsonProperty("enable")
    public boolean getEnable() { return enable; }
    @JsonProperty("enable")
    public void setEnable(boolean value) { this.enable = value; }
}
