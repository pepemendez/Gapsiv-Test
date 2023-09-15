import com.fasterxml.jackson.annotation.*;

public class MembershipConfig {
    private boolean showWPlusBanner;

    @JsonProperty("showWPlusBanner")
    public boolean getShowWPlusBanner() { return showWPlusBanner; }
    @JsonProperty("showWPlusBanner")
    public void setShowWPlusBanner(boolean value) { this.showWPlusBanner = value; }
}
