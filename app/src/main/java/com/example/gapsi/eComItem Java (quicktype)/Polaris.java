import com.fasterxml.jackson.annotation.*;

public class Polaris {
    private String rerankOffset;

    @JsonProperty("rerankOffset")
    public String getRerankOffset() { return rerankOffset; }
    @JsonProperty("rerankOffset")
    public void setRerankOffset(String value) { this.rerankOffset = value; }
}
