import com.fasterxml.jackson.annotation.*;

public class PageProps {
    private InitialData initialData;
    private InitialSearchQueryVariables initialSearchQueryVariables;
    private Psych psych;
    private String isomorphicSessionID;
    private Trace trace;
    private boolean isCaching;
    private long queryContextCacheID;
    private BootstrapData bootstrapData;
    private boolean enableGqlCsrRedirect;
    private String nonce;
    private PersistedQueriesConfig persistedQueriesConfig;
    private DehydratedSearchCv dehydratedSearchCv;
    private String adSessionID;
    private boolean excludeBeacon;
    private boolean isNextPublicMocksEnabled;

    @JsonProperty("initialData")
    public InitialData getInitialData() { return initialData; }
    @JsonProperty("initialData")
    public void setInitialData(InitialData value) { this.initialData = value; }

    @JsonProperty("initialSearchQueryVariables")
    public InitialSearchQueryVariables getInitialSearchQueryVariables() { return initialSearchQueryVariables; }
    @JsonProperty("initialSearchQueryVariables")
    public void setInitialSearchQueryVariables(InitialSearchQueryVariables value) { this.initialSearchQueryVariables = value; }

    @JsonProperty("psych")
    public Psych getPsych() { return psych; }
    @JsonProperty("psych")
    public void setPsych(Psych value) { this.psych = value; }

    @JsonProperty("isomorphicSessionId")
    public String getIsomorphicSessionID() { return isomorphicSessionID; }
    @JsonProperty("isomorphicSessionId")
    public void setIsomorphicSessionID(String value) { this.isomorphicSessionID = value; }

    @JsonProperty("trace")
    public Trace getTrace() { return trace; }
    @JsonProperty("trace")
    public void setTrace(Trace value) { this.trace = value; }

    @JsonProperty("isCaching")
    public boolean getIsCaching() { return isCaching; }
    @JsonProperty("isCaching")
    public void setIsCaching(boolean value) { this.isCaching = value; }

    @JsonProperty("queryContextCacheId")
    public long getQueryContextCacheID() { return queryContextCacheID; }
    @JsonProperty("queryContextCacheId")
    public void setQueryContextCacheID(long value) { this.queryContextCacheID = value; }

    @JsonProperty("bootstrapData")
    public BootstrapData getBootstrapData() { return bootstrapData; }
    @JsonProperty("bootstrapData")
    public void setBootstrapData(BootstrapData value) { this.bootstrapData = value; }

    @JsonProperty("enableGqlCsrRedirect")
    public boolean getEnableGqlCsrRedirect() { return enableGqlCsrRedirect; }
    @JsonProperty("enableGqlCsrRedirect")
    public void setEnableGqlCsrRedirect(boolean value) { this.enableGqlCsrRedirect = value; }

    @JsonProperty("nonce")
    public String getNonce() { return nonce; }
    @JsonProperty("nonce")
    public void setNonce(String value) { this.nonce = value; }

    @JsonProperty("persistedQueriesConfig")
    public PersistedQueriesConfig getPersistedQueriesConfig() { return persistedQueriesConfig; }
    @JsonProperty("persistedQueriesConfig")
    public void setPersistedQueriesConfig(PersistedQueriesConfig value) { this.persistedQueriesConfig = value; }

    @JsonProperty("dehydratedSearchCv")
    public DehydratedSearchCv getDehydratedSearchCv() { return dehydratedSearchCv; }
    @JsonProperty("dehydratedSearchCv")
    public void setDehydratedSearchCv(DehydratedSearchCv value) { this.dehydratedSearchCv = value; }

    @JsonProperty("adSessionId")
    public String getAdSessionID() { return adSessionID; }
    @JsonProperty("adSessionId")
    public void setAdSessionID(String value) { this.adSessionID = value; }

    @JsonProperty("excludeBeacon")
    public boolean getExcludeBeacon() { return excludeBeacon; }
    @JsonProperty("excludeBeacon")
    public void setExcludeBeacon(boolean value) { this.excludeBeacon = value; }

    @JsonProperty("isNextPublicMocksEnabled")
    public boolean getIsNextPublicMocksEnabled() { return isNextPublicMocksEnabled; }
    @JsonProperty("isNextPublicMocksEnabled")
    public void setIsNextPublicMocksEnabled(boolean value) { this.isNextPublicMocksEnabled = value; }
}
