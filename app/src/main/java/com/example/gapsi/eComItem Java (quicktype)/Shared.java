import com.fasterxml.jackson.annotation.*;

public class Shared {
    private SharedAll all;

    @JsonProperty("_all_")
    public SharedAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(SharedAll value) { this.all = value; }
}
