import com.fasterxml.jackson.annotation.*;

public class ProductLocation {
    private String displayValue;
    private Aisle aisle;

    @JsonProperty("displayValue")
    public String getDisplayValue() { return displayValue; }
    @JsonProperty("displayValue")
    public void setDisplayValue(String value) { this.displayValue = value; }

    @JsonProperty("aisle")
    public Aisle getAisle() { return aisle; }
    @JsonProperty("aisle")
    public void setAisle(Aisle value) { this.aisle = value; }
}
