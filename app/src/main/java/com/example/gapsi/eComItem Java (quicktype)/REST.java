import com.fasterxml.jackson.annotation.*;

public class REST {
    private RESTEndpointsByName endpointsByName;

    @JsonProperty("endpointsByName")
    public RESTEndpointsByName getEndpointsByName() { return endpointsByName; }
    @JsonProperty("endpointsByName")
    public void setEndpointsByName(RESTEndpointsByName value) { this.endpointsByName = value; }
}
