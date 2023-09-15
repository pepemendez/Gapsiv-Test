import com.fasterxml.jackson.annotation.*;

public class PulseBeacon {
    private boolean enable;
    private String hostname;
    private String bd;
    private String bh;
    private String hostWithQM;
    private String hostWithoutQM;
    private String photoHost;
    private String photoHostWithoutQM;

    @JsonProperty("enable")
    public boolean getEnable() { return enable; }
    @JsonProperty("enable")
    public void setEnable(boolean value) { this.enable = value; }

    @JsonProperty("hostname")
    public String getHostname() { return hostname; }
    @JsonProperty("hostname")
    public void setHostname(String value) { this.hostname = value; }

    @JsonProperty("bd")
    public String getBd() { return bd; }
    @JsonProperty("bd")
    public void setBd(String value) { this.bd = value; }

    @JsonProperty("bh")
    public String getBh() { return bh; }
    @JsonProperty("bh")
    public void setBh(String value) { this.bh = value; }

    @JsonProperty("hostWithQM")
    public String getHostWithQM() { return hostWithQM; }
    @JsonProperty("hostWithQM")
    public void setHostWithQM(String value) { this.hostWithQM = value; }

    @JsonProperty("hostWithoutQM")
    public String getHostWithoutQM() { return hostWithoutQM; }
    @JsonProperty("hostWithoutQM")
    public void setHostWithoutQM(String value) { this.hostWithoutQM = value; }

    @JsonProperty("photoHost")
    public String getPhotoHost() { return photoHost; }
    @JsonProperty("photoHost")
    public void setPhotoHost(String value) { this.photoHost = value; }

    @JsonProperty("photoHostWithoutQM")
    public String getPhotoHostWithoutQM() { return photoHostWithoutQM; }
    @JsonProperty("photoHostWithoutQM")
    public void setPhotoHostWithoutQM(String value) { this.photoHostWithoutQM = value; }
}
