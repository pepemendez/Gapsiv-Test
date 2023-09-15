import com.fasterxml.jackson.annotation.*;

public class Tenant {
    private Host host;
    private String mart;
    private String[] templates;

    @JsonProperty("host")
    public Host getHost() { return host; }
    @JsonProperty("host")
    public void setHost(Host value) { this.host = value; }

    @JsonProperty("mart")
    public String getMart() { return mart; }
    @JsonProperty("mart")
    public void setMart(String value) { this.mart = value; }

    @JsonProperty("templates")
    public String[] getTemplates() { return templates; }
    @JsonProperty("templates")
    public void setTemplates(String[] value) { this.templates = value; }
}
