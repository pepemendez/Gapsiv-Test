import com.fasterxml.jackson.annotation.*;

public class PAP {
    private Polaris polaris;

    @JsonProperty("polaris")
    public Polaris getPolaris() { return polaris; }
    @JsonProperty("polaris")
    public void setPolaris(Polaris value) { this.polaris = value; }
}
