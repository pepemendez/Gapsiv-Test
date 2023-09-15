import com.fasterxml.jackson.annotation.*;

public class BootstrapDataHeader {
    private HeaderData data;
    private Headers headers;

    @JsonProperty("data")
    public HeaderData getData() { return data; }
    @JsonProperty("data")
    public void setData(HeaderData value) { this.data = value; }

    @JsonProperty("headers")
    public Headers getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Headers value) { this.headers = value; }
}
