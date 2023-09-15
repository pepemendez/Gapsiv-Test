import com.fasterxml.jackson.annotation.*;

public class ConfigsSubLink {
    private PurpleLink link;
    private IsSfLink isSFLink;
    private IsSfLink openInNewTab;

    @JsonProperty("link")
    public PurpleLink getLink() { return link; }
    @JsonProperty("link")
    public void setLink(PurpleLink value) { this.link = value; }

    @JsonProperty("isSFLink")
    public IsSfLink getIsSFLink() { return isSFLink; }
    @JsonProperty("isSFLink")
    public void setIsSFLink(IsSfLink value) { this.isSFLink = value; }

    @JsonProperty("openInNewTab")
    public IsSfLink getOpenInNewTab() { return openInNewTab; }
    @JsonProperty("openInNewTab")
    public void setOpenInNewTab(IsSfLink value) { this.openInNewTab = value; }
}
