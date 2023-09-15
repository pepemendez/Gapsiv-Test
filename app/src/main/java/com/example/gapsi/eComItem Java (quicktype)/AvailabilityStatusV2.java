import com.fasterxml.jackson.annotation.*;

public class AvailabilityStatusV2 {
    private AvailabilityStatusDisplayValue display;
    private ValueEnum value;

    @JsonProperty("display")
    public AvailabilityStatusDisplayValue getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(AvailabilityStatusDisplayValue value) { this.display = value; }

    @JsonProperty("value")
    public ValueEnum getValue() { return value; }
    @JsonProperty("value")
    public void setValue(ValueEnum value) { this.value = value; }
}
