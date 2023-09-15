import com.fasterxml.jackson.annotation.*;

public class FulfillmentBadgeGroup {
    private Text text;
    private SlaText slaText;
    private boolean isSlaTextBold;
    private Object templates;
    private ClassName className;

    @JsonProperty("text")
    public Text getText() { return text; }
    @JsonProperty("text")
    public void setText(Text value) { this.text = value; }

    @JsonProperty("slaText")
    public SlaText getSlaText() { return slaText; }
    @JsonProperty("slaText")
    public void setSlaText(SlaText value) { this.slaText = value; }

    @JsonProperty("isSlaTextBold")
    public boolean getIsSlaTextBold() { return isSlaTextBold; }
    @JsonProperty("isSlaTextBold")
    public void setIsSlaTextBold(boolean value) { this.isSlaTextBold = value; }

    @JsonProperty("templates")
    public Object getTemplates() { return templates; }
    @JsonProperty("templates")
    public void setTemplates(Object value) { this.templates = value; }

    @JsonProperty("className")
    public ClassName getClassName() { return className; }
    @JsonProperty("className")
    public void setClassName(ClassName value) { this.className = value; }
}
