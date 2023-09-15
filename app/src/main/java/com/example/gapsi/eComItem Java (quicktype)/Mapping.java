import com.fasterxml.jackson.annotation.*;

public class Mapping {
    private MappingType type;
    private Options options;

    @JsonProperty("type")
    public MappingType getType() { return type; }
    @JsonProperty("type")
    public void setType(MappingType value) { this.type = value; }

    @JsonProperty("options")
    public Options getOptions() { return options; }
    @JsonProperty("options")
    public void setOptions(Options value) { this.options = value; }
}
