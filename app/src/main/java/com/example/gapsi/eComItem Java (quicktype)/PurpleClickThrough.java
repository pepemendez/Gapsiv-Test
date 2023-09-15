import com.fasterxml.jackson.annotation.*;

public class PurpleClickThrough {
    private ClickThroughType type;
    private String value;
    private String rawValue;

    @JsonProperty("type")
    public ClickThroughType getType() { return type; }
    @JsonProperty("type")
    public void setType(ClickThroughType value) { this.type = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }

    @JsonProperty("rawValue")
    public String getRawValue() { return rawValue; }
    @JsonProperty("rawValue")
    public void setRawValue(String value) { this.rawValue = value; }
}
