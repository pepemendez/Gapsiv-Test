import com.fasterxml.jackson.annotation.*;

public class Psych {
    private boolean isMobile;
    private boolean isBot;
    private boolean isDesktop;
    private String trafficType;
    private String browserName;
    private String previousAppVersion;
    private String visitType;

    @JsonProperty("isMobile")
    public boolean getIsMobile() { return isMobile; }
    @JsonProperty("isMobile")
    public void setIsMobile(boolean value) { this.isMobile = value; }

    @JsonProperty("isBot")
    public boolean getIsBot() { return isBot; }
    @JsonProperty("isBot")
    public void setIsBot(boolean value) { this.isBot = value; }

    @JsonProperty("isDesktop")
    public boolean getIsDesktop() { return isDesktop; }
    @JsonProperty("isDesktop")
    public void setIsDesktop(boolean value) { this.isDesktop = value; }

    @JsonProperty("trafficType")
    public String getTrafficType() { return trafficType; }
    @JsonProperty("trafficType")
    public void setTrafficType(String value) { this.trafficType = value; }

    @JsonProperty("browserName")
    public String getBrowserName() { return browserName; }
    @JsonProperty("browserName")
    public void setBrowserName(String value) { this.browserName = value; }

    @JsonProperty("previousAppVersion")
    public String getPreviousAppVersion() { return previousAppVersion; }
    @JsonProperty("previousAppVersion")
    public void setPreviousAppVersion(String value) { this.previousAppVersion = value; }

    @JsonProperty("visitType")
    public String getVisitType() { return visitType; }
    @JsonProperty("visitType")
    public void setVisitType(String value) { this.visitType = value; }
}
