import com.fasterxml.jackson.annotation.*;

public class TopZone5Configs {
    private String typename;
    private Object fitments;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("fitments")
    public Object getFitments() { return fitments; }
    @JsonProperty("fitments")
    public void setFitments(Object value) { this.fitments = value; }
}
