import com.fasterxml.jackson.annotation.*;

public class CvFooter {
    private FooterAll all;

    @JsonProperty("_all_")
    public FooterAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(FooterAll value) { this.all = value; }
}
