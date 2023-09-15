import com.fasterxml.jackson.annotation.*;

public class SubCategorySubLink {
    private FluffyLink link;
    private String icon;

    @JsonProperty("link")
    public FluffyLink getLink() { return link; }
    @JsonProperty("link")
    public void setLink(FluffyLink value) { this.link = value; }

    @JsonProperty("icon")
    public String getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(String value) { this.icon = value; }
}
