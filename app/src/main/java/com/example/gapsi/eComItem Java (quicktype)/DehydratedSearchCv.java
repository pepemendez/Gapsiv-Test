import com.fasterxml.jackson.annotation.*;

public class DehydratedSearchCv {
    private boolean enableLCPHighFetchPriority;
    private boolean enableLCPSingleImagePrefetch;

    @JsonProperty("enableLCPHighFetchPriority")
    public boolean getEnableLCPHighFetchPriority() { return enableLCPHighFetchPriority; }
    @JsonProperty("enableLCPHighFetchPriority")
    public void setEnableLCPHighFetchPriority(boolean value) { this.enableLCPHighFetchPriority = value; }

    @JsonProperty("enableLCPSingleImagePrefetch")
    public boolean getEnableLCPSingleImagePrefetch() { return enableLCPSingleImagePrefetch; }
    @JsonProperty("enableLCPSingleImagePrefetch")
    public void setEnableLCPSingleImagePrefetch(boolean value) { this.enableLCPSingleImagePrefetch = value; }
}
