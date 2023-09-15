import com.fasterxml.jackson.annotation.*;

public class Facet {
    private String title;
    private String name;
    private Boolean expandOnLoad;
    private String type;
    private Object displayType;
    private AffinityOverride layout;
    private Long min;
    private Long max;
    private Object selectedMin;
    private Object selectedMax;
    private Boolean unboundedMax;
    private Long stepSize;
    private Object isSelected;
    private ValueElement[] values;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("expandOnLoad")
    public Boolean getExpandOnLoad() { return expandOnLoad; }
    @JsonProperty("expandOnLoad")
    public void setExpandOnLoad(Boolean value) { this.expandOnLoad = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("displayType")
    public Object getDisplayType() { return displayType; }
    @JsonProperty("displayType")
    public void setDisplayType(Object value) { this.displayType = value; }

    @JsonProperty("layout")
    public AffinityOverride getLayout() { return layout; }
    @JsonProperty("layout")
    public void setLayout(AffinityOverride value) { this.layout = value; }

    @JsonProperty("min")
    public Long getMin() { return min; }
    @JsonProperty("min")
    public void setMin(Long value) { this.min = value; }

    @JsonProperty("max")
    public Long getMax() { return max; }
    @JsonProperty("max")
    public void setMax(Long value) { this.max = value; }

    @JsonProperty("selectedMin")
    public Object getSelectedMin() { return selectedMin; }
    @JsonProperty("selectedMin")
    public void setSelectedMin(Object value) { this.selectedMin = value; }

    @JsonProperty("selectedMax")
    public Object getSelectedMax() { return selectedMax; }
    @JsonProperty("selectedMax")
    public void setSelectedMax(Object value) { this.selectedMax = value; }

    @JsonProperty("unboundedMax")
    public Boolean getUnboundedMax() { return unboundedMax; }
    @JsonProperty("unboundedMax")
    public void setUnboundedMax(Boolean value) { this.unboundedMax = value; }

    @JsonProperty("stepSize")
    public Long getStepSize() { return stepSize; }
    @JsonProperty("stepSize")
    public void setStepSize(Long value) { this.stepSize = value; }

    @JsonProperty("isSelected")
    public Object getIsSelected() { return isSelected; }
    @JsonProperty("isSelected")
    public void setIsSelected(Object value) { this.isSelected = value; }

    @JsonProperty("values")
    public ValueElement[] getValues() { return values; }
    @JsonProperty("values")
    public void setValues(ValueElement[] value) { this.values = value; }
}
