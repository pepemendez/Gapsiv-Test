import com.fasterxml.jackson.annotation.*;

public class Aisle {
    private String zone;
    private long aisle;

    @JsonProperty("zone")
    public String getZone() { return zone; }
    @JsonProperty("zone")
    public void setZone(String value) { this.zone = value; }

    @JsonProperty("aisle")
    public long getAisle() { return aisle; }
    @JsonProperty("aisle")
    public void setAisle(long value) { this.aisle = value; }
}
