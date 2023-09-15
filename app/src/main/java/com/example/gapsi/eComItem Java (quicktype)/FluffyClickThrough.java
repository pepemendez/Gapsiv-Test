import com.fasterxml.jackson.annotation.*;

public class FluffyClickThrough {
    private String value;

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
