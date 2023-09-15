import com.fasterxml.jackson.annotation.*;

public class ContentContent {
    private String type;
    private String id;
    private Mapping[] mapping;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("mapping")
    public Mapping[] getMapping() { return mapping; }
    @JsonProperty("mapping")
    public void setMapping(Mapping[] value) { this.mapping = value; }
}
