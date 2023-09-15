import com.fasterxml.jackson.annotation.*;

public class PresoDebugInformation {
    private Object explainerToolsResponse;

    @JsonProperty("explainerToolsResponse")
    public Object getExplainerToolsResponse() { return explainerToolsResponse; }
    @JsonProperty("explainerToolsResponse")
    public void setExplainerToolsResponse(Object value) { this.explainerToolsResponse = value; }
}
