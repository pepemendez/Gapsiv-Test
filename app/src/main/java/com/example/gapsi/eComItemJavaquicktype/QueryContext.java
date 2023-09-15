package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class QueryContext {
    private String appVersion;
    private Gql gql;
    private REST rest;

    @JsonProperty("appVersion")
    public String getAppVersion() { return appVersion; }
    @JsonProperty("appVersion")
    public void setAppVersion(String value) { this.appVersion = value; }

    @JsonProperty("gql")
    public Gql getGql() { return gql; }
    @JsonProperty("gql")
    public void setGql(Gql value) { this.gql = value; }

    @JsonProperty("rest")
    public REST getREST() { return rest; }
    @JsonProperty("rest")
    public void setREST(REST value) { this.rest = value; }
}
