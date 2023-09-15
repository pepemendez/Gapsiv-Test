import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class FluffyModule {
    private String name;
    private String type;
    private UUID moduleID;
    private MatchedTrigger matchedTrigger;
    private FluffyConfigs configs;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("moduleId")
    public UUID getModuleID() { return moduleID; }
    @JsonProperty("moduleId")
    public void setModuleID(UUID value) { this.moduleID = value; }

    @JsonProperty("matchedTrigger")
    public MatchedTrigger getMatchedTrigger() { return matchedTrigger; }
    @JsonProperty("matchedTrigger")
    public void setMatchedTrigger(MatchedTrigger value) { this.matchedTrigger = value; }

    @JsonProperty("configs")
    public FluffyConfigs getConfigs() { return configs; }
    @JsonProperty("configs")
    public void setConfigs(FluffyConfigs value) { this.configs = value; }
}
