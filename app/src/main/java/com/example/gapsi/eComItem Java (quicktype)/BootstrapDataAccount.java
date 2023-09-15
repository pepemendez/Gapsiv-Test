import com.fasterxml.jackson.annotation.*;

public class BootstrapDataAccount {
    private Headers data;

    @JsonProperty("data")
    public Headers getData() { return data; }
    @JsonProperty("data")
    public void setData(Headers value) { this.data = value; }
}
