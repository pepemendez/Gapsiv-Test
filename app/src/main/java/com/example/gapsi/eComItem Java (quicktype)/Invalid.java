import com.fasterxml.jackson.annotation.*;

public class Invalid {
    private ModuleTypename typename;
    private String type;
    private String name;
    private long version;
    private String moduleID;
    private Schedule schedule;
    private MatchedTrigger matchedTrigger;
    private INVALIDConfigs configs;

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
    public String getModuleID() { return moduleID; }
    @JsonProperty("moduleId")
    public void setModuleID(String value) { this.moduleID = value; }

    @JsonProperty("schedule")
    public Schedule getSchedule() { return schedule; }
    @JsonProperty("schedule")
    public void setSchedule(Schedule value) { this.schedule = value; }

    @JsonProperty("matchedTrigger")
    public MatchedTrigger getMatchedTrigger() { return matchedTrigger; }
    @JsonProperty("matchedTrigger")
    public void setMatchedTrigger(MatchedTrigger value) { this.matchedTrigger = value; }

    @JsonProperty("configs")
    public INVALIDConfigs getConfigs() { return configs; }
    @JsonProperty("configs")
    public void setConfigs(INVALIDConfigs value) { this.configs = value; }
}
