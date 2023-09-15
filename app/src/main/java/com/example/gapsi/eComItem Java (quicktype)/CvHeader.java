import com.fasterxml.jackson.annotation.*;

public class CvHeader {
    private HeaderAll all;

    @JsonProperty("_all_")
    public HeaderAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(HeaderAll value) { this.all = value; }
}
