import com.fasterxml.jackson.annotation.*;

public class TopZone6Configs {
    private String typename;
    private String title;
    private String subTitle;
    private String urlLinkText;
    private String url;

    @JsonProperty("__typename")
    public String getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(String value) { this.typename = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("subTitle")
    public String getSubTitle() { return subTitle; }
    @JsonProperty("subTitle")
    public void setSubTitle(String value) { this.subTitle = value; }

    @JsonProperty("urlLinkText")
    public String getURLLinkText() { return urlLinkText; }
    @JsonProperty("urlLinkText")
    public void setURLLinkText(String value) { this.urlLinkText = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
