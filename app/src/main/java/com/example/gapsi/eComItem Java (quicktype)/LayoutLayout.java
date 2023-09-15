import com.fasterxml.jackson.annotation.*;

public class LayoutLayout {
    private String type;
    private String name;
    private LayoutContainerData definition;
    private Channel channel;
    private String version;
    private String status;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("definition")
    public LayoutContainerData getDefinition() { return definition; }
    @JsonProperty("definition")
    public void setDefinition(LayoutContainerData value) { this.definition = value; }

    @JsonProperty("channel")
    public Channel getChannel() { return channel; }
    @JsonProperty("channel")
    public void setChannel(Channel value) { this.channel = value; }

    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }
}
