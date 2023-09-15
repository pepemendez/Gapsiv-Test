import com.fasterxml.jackson.annotation.*;

public class AspectInfo {
    private Object name;
    private Object header;
    private Object id;
    private Object snippet;

    @JsonProperty("name")
    public Object getName() { return name; }
    @JsonProperty("name")
    public void setName(Object value) { this.name = value; }

    @JsonProperty("header")
    public Object getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(Object value) { this.header = value; }

    @JsonProperty("id")
    public Object getID() { return id; }
    @JsonProperty("id")
    public void setID(Object value) { this.id = value; }

    @JsonProperty("snippet")
    public Object getSnippet() { return snippet; }
    @JsonProperty("snippet")
    public void setSnippet(Object value) { this.snippet = value; }
}
