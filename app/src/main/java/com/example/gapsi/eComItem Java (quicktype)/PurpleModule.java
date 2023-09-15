import com.fasterxml.jackson.annotation.*;

public class PurpleModule {
    private String name;
    private String type;
    private MatchedTrigger matchedTrigger;
    private PurpleConfigs configs;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("matchedTrigger")
    public MatchedTrigger getMatchedTrigger() { return matchedTrigger; }
    @JsonProperty("matchedTrigger")
    public void setMatchedTrigger(MatchedTrigger value) { this.matchedTrigger = value; }

    @JsonProperty("configs")
    public PurpleConfigs getConfigs() { return configs; }
    @JsonProperty("configs")
    public void setConfigs(PurpleConfigs value) { this.configs = value; }
}
