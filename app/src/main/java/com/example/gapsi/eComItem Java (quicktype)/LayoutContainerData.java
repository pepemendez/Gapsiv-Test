import com.fasterxml.jackson.annotation.*;

public class LayoutContainerData {
    private String type;
    private String flow;
    private ContentElement[] content;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("flow")
    public String getFlow() { return flow; }
    @JsonProperty("flow")
    public void setFlow(String value) { this.flow = value; }

    @JsonProperty("content")
    public ContentElement[] getContent() { return content; }
    @JsonProperty("content")
    public void setContent(ContentElement[] value) { this.content = value; }
}
