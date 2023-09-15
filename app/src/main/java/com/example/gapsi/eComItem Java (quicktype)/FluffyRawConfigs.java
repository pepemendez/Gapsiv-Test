import com.fasterxml.jackson.annotation.*;

public class FluffyRawConfigs {
    private String moduleLocation;
    private String lazy;

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }

    @JsonProperty("lazy")
    public String getLazy() { return lazy; }
    @JsonProperty("lazy")
    public void setLazy(String value) { this.lazy = value; }
}
