import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class Zone1 {
    private ModuleTypename typename;
    private String type;
    private String name;
    private long version;
    private UUID moduleID;
    private Schedule schedule;
    private MatchedTrigger matchedTrigger;
    private BottomZone1Configs configs;

    @JsonProperty("__typename")
    public ModuleTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(ModuleTypename value) { this.typename = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("version")
    public long getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(long value) { this.version = value; }

    @JsonProperty("moduleId")
    public UUID getModuleID() { return moduleID; }
    @JsonProperty("moduleId")
    public void setModuleID(UUID value) { this.moduleID = value; }

    @JsonProperty("schedule")
    public Schedule getSchedule() { return schedule; }
    @JsonProperty("schedule")
    public void setSchedule(Schedule value) { this.schedule = value; }

    @JsonProperty("matchedTrigger")
    public MatchedTrigger getMatchedTrigger() { return matchedTrigger; }
    @JsonProperty("matchedTrigger")
    public void setMatchedTrigger(MatchedTrigger value) { this.matchedTrigger = value; }

    @JsonProperty("configs")
    public BottomZone1Configs getConfigs() { return configs; }
    @JsonProperty("configs")
    public void setConfigs(BottomZone1Configs value) { this.configs = value; }
}
