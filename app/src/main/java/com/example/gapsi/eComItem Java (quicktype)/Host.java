import com.fasterxml.jackson.annotation.*;

public class Host {
    private String stage;
    private String teflon;
    private String production;

    @JsonProperty("stage")
    public String getStage() { return stage; }
    @JsonProperty("stage")
    public void setStage(String value) { this.stage = value; }

    @JsonProperty("teflon")
    public String getTeflon() { return teflon; }
    @JsonProperty("teflon")
    public void setTeflon(String value) { this.teflon = value; }

    @JsonProperty("production")
    public String getProduction() { return production; }
    @JsonProperty("production")
    public void setProduction(String value) { this.production = value; }
}
