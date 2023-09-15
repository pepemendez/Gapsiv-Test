import com.fasterxml.jackson.annotation.*;

public class Pulse {
    private PulseAll all;

    @JsonProperty("_all_")
    public PulseAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(PulseAll value) { this.all = value; }
}
