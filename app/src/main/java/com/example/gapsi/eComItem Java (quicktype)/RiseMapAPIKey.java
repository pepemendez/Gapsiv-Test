import com.fasterxml.jackson.annotation.*;

public class RiseMapAPIKey {
    private String dev;
    private String defaultKey;

    @JsonProperty("dev")
    public String getDev() { return dev; }
    @JsonProperty("dev")
    public void setDev(String value) { this.dev = value; }

    @JsonProperty("defaultKey")
    public String getDefaultKey() { return defaultKey; }
    @JsonProperty("defaultKey")
    public void setDefaultKey(String value) { this.defaultKey = value; }
}
