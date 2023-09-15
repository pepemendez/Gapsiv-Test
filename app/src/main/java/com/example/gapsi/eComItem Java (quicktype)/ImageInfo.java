import com.fasterxml.jackson.annotation.*;

public class ImageInfo {
    private String id;
    private String name;
    private String thumbnailURL;
    private Size size;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("thumbnailUrl")
    public String getThumbnailURL() { return thumbnailURL; }
    @JsonProperty("thumbnailUrl")
    public void setThumbnailURL(String value) { this.thumbnailURL = value; }

    @JsonProperty("size")
    public Size getSize() { return size; }
    @JsonProperty("size")
    public void setSize(Size value) { this.size = value; }
}
