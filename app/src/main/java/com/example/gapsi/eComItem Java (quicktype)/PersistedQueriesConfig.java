import com.fasterxml.jackson.annotation.*;

public class PersistedQueriesConfig {
    private String[] allowList;
    private String[] blackList;
    private boolean enableAllowList;
    private boolean enablePersistedQueries;

    @JsonProperty("allowList")
    public String[] getAllowList() { return allowList; }
    @JsonProperty("allowList")
    public void setAllowList(String[] value) { this.allowList = value; }

    @JsonProperty("blackList")
    public String[] getBlackList() { return blackList; }
    @JsonProperty("blackList")
    public void setBlackList(String[] value) { this.blackList = value; }

    @JsonProperty("enableAllowList")
    public boolean getEnableAllowList() { return enableAllowList; }
    @JsonProperty("enableAllowList")
    public void setEnableAllowList(boolean value) { this.enableAllowList = value; }

    @JsonProperty("enablePersistedQueries")
    public boolean getEnablePersistedQueries() { return enablePersistedQueries; }
    @JsonProperty("enablePersistedQueries")
    public void setEnablePersistedQueries(boolean value) { this.enablePersistedQueries = value; }
}
