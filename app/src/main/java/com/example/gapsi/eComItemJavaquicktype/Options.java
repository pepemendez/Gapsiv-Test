package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Options {
    private String refID;
    private String tempoLabel;
    private Boolean displayInTempo;

    @JsonProperty("refId")
    public String getRefID() { return refID; }
    @JsonProperty("refId")
    public void setRefID(String value) { this.refID = value; }

    @JsonProperty("tempoLabel")
    public String getTempoLabel() { return tempoLabel; }
    @JsonProperty("tempoLabel")
    public void setTempoLabel(String value) { this.tempoLabel = value; }

    @JsonProperty("displayInTempo")
    public Boolean getDisplayInTempo() { return displayInTempo; }
    @JsonProperty("displayInTempo")
    public void setDisplayInTempo(Boolean value) { this.displayInTempo = value; }
}
