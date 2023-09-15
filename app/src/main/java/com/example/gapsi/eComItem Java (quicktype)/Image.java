import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class Image {
    private String src;
    private String alt;
    private UUID assetID;
    private String assetName;

    @JsonProperty("src")
    public String getSrc() { return src; }
    @JsonProperty("src")
    public void setSrc(String value) { this.src = value; }

    @JsonProperty("alt")
    public String getAlt() { return alt; }
    @JsonProperty("alt")
    public void setAlt(String value) { this.alt = value; }

    @JsonProperty("assetId")
    public UUID getAssetID() { return assetID; }
    @JsonProperty("assetId")
    public void setAssetID(UUID value) { this.assetID = value; }

    @JsonProperty("assetName")
    public String getAssetName() { return assetName; }
    @JsonProperty("assetName")
    public void setAssetName(String value) { this.assetName = value; }
}
