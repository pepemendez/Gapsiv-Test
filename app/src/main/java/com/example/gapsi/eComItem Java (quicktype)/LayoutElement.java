import com.fasterxml.jackson.annotation.*;

public class LayoutElement {
    private String id;
    private LayoutLayout layout;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("layout")
    public LayoutLayout getLayout() { return layout; }
    @JsonProperty("layout")
    public void setLayout(LayoutLayout value) { this.layout = value; }
}
