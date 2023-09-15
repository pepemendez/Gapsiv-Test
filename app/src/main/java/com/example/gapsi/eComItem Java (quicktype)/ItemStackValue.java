import com.fasterxml.jackson.annotation.*;

public class ItemStackValue {
    private String usItemID;

    @JsonProperty("usItemId")
    public String getUsItemID() { return usItemID; }
    @JsonProperty("usItemId")
    public void setUsItemID(String value) { this.usItemID = value; }
}
