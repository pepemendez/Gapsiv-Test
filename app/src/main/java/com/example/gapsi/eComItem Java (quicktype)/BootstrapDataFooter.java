import com.fasterxml.jackson.annotation.*;

public class BootstrapDataFooter {
    private FooterData data;
    private Headers headers;

    @JsonProperty("data")
    public FooterData getData() { return data; }
    @JsonProperty("data")
    public void setData(FooterData value) { this.data = value; }

    @JsonProperty("headers")
    public Headers getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Headers value) { this.headers = value; }
}
