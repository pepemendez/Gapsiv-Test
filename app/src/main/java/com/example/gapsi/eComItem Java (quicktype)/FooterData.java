import com.fasterxml.jackson.annotation.*;

public class FooterData {
    private PurpleContentLayout contentLayout;

    @JsonProperty("contentLayout")
    public PurpleContentLayout getContentLayout() { return contentLayout; }
    @JsonProperty("contentLayout")
    public void setContentLayout(PurpleContentLayout value) { this.contentLayout = value; }
}
