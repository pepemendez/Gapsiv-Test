import com.fasterxml.jackson.annotation.*;

public class PulseAll {
    private boolean enableV1Schema;
    private boolean enableQuantumMetric;
    private boolean enableScriptDefer;
    private String alwaysAllowedTagList;
    private String logLevel;
    private boolean enableBeaconDefer;
    private boolean enableATFMarker;

    @JsonProperty("enableV1Schema")
    public boolean getEnableV1Schema() { return enableV1Schema; }
    @JsonProperty("enableV1Schema")
    public void setEnableV1Schema(boolean value) { this.enableV1Schema = value; }

    @JsonProperty("enableQuantumMetric")
    public boolean getEnableQuantumMetric() { return enableQuantumMetric; }
    @JsonProperty("enableQuantumMetric")
    public void setEnableQuantumMetric(boolean value) { this.enableQuantumMetric = value; }

    @JsonProperty("enableScriptDefer")
    public boolean getEnableScriptDefer() { return enableScriptDefer; }
    @JsonProperty("enableScriptDefer")
    public void setEnableScriptDefer(boolean value) { this.enableScriptDefer = value; }

    @JsonProperty("alwaysAllowedTagList")
    public String getAlwaysAllowedTagList() { return alwaysAllowedTagList; }
    @JsonProperty("alwaysAllowedTagList")
    public void setAlwaysAllowedTagList(String value) { this.alwaysAllowedTagList = value; }

    @JsonProperty("logLevel")
    public String getLogLevel() { return logLevel; }
    @JsonProperty("logLevel")
    public void setLogLevel(String value) { this.logLevel = value; }

    @JsonProperty("enableBeaconDefer")
    public boolean getEnableBeaconDefer() { return enableBeaconDefer; }
    @JsonProperty("enableBeaconDefer")
    public void setEnableBeaconDefer(boolean value) { this.enableBeaconDefer = value; }

    @JsonProperty("enableATFMarker")
    public boolean getEnableATFMarker() { return enableATFMarker; }
    @JsonProperty("enableATFMarker")
    public void setEnableATFMarker(boolean value) { this.enableATFMarker = value; }
}
