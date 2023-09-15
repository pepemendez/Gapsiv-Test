import com.fasterxml.jackson.annotation.*;

public class ValueElement {
    private String id;
    private String title;
    private String name;
    private boolean expandOnLoad;
    private Object description;
    private String type;
    private Long itemCount;
    private Boolean isSelected;
    private String baseSEOURL;
    private Object values;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("expandOnLoad")
    public boolean getExpandOnLoad() { return expandOnLoad; }
    @JsonProperty("expandOnLoad")
    public void setExpandOnLoad(boolean value) { this.expandOnLoad = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("itemCount")
    public Long getItemCount() { return itemCount; }
    @JsonProperty("itemCount")
    public void setItemCount(Long value) { this.itemCount = value; }

    @JsonProperty("isSelected")
    public Boolean getIsSelected() { return isSelected; }
    @JsonProperty("isSelected")
    public void setIsSelected(Boolean value) { this.isSelected = value; }

    @JsonProperty("baseSeoURL")
    public String getBaseSEOURL() { return baseSEOURL; }
    @JsonProperty("baseSeoURL")
    public void setBaseSEOURL(String value) { this.baseSEOURL = value; }

    @JsonProperty("values")
    public Object getValues() { return values; }
    @JsonProperty("values")
    public void setValues(Object value) { this.values = value; }
}
