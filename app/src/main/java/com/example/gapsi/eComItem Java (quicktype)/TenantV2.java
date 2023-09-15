import com.fasterxml.jackson.annotation.*;

public class TenantV2 {
    private String bu;
    private String mart;

    @JsonProperty("bu")
    public String getBu() { return bu; }
    @JsonProperty("bu")
    public void setBu(String value) { this.bu = value; }

    @JsonProperty("mart")
    public String getMart() { return mart; }
    @JsonProperty("mart")
    public void setMart(String value) { this.mart = value; }
}
