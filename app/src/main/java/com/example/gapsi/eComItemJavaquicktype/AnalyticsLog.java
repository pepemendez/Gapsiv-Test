package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class AnalyticsLog {
    private FeLog feLog;

    @JsonProperty("fe_log")
    public FeLog getFeLog() { return feLog; }
    @JsonProperty("fe_log")
    public void setFeLog(FeLog value) { this.feLog = value; }
}
