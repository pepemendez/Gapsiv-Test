package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ModuleDataByZone {
    private PillsTopZone pillsTopZone;
    private Zone1 bottomZone1;
    private TopZone3 topZone3;
    private Zone1 topZone1;
    private TopZone2 topZone2;
    private BrowsingHistoryZone browsingHistoryZone;
    private TopZone5 topZone5;
    private TopZone6 topZone6;
    private BottomZone2 bottomZone2;
    private Invalid invalid;

    @JsonProperty("pillsTopZone")
    public PillsTopZone getPillsTopZone() { return pillsTopZone; }
    @JsonProperty("pillsTopZone")
    public void setPillsTopZone(PillsTopZone value) { this.pillsTopZone = value; }

    @JsonProperty("bottomZone1")
    public Zone1 getBottomZone1() { return bottomZone1; }
    @JsonProperty("bottomZone1")
    public void setBottomZone1(Zone1 value) { this.bottomZone1 = value; }

    @JsonProperty("topZone3")
    public TopZone3 getTopZone3() { return topZone3; }
    @JsonProperty("topZone3")
    public void setTopZone3(TopZone3 value) { this.topZone3 = value; }

    @JsonProperty("topZone1")
    public Zone1 getTopZone1() { return topZone1; }
    @JsonProperty("topZone1")
    public void setTopZone1(Zone1 value) { this.topZone1 = value; }

    @JsonProperty("topZone2")
    public TopZone2 getTopZone2() { return topZone2; }
    @JsonProperty("topZone2")
    public void setTopZone2(TopZone2 value) { this.topZone2 = value; }

    @JsonProperty("browsingHistoryZone")
    public BrowsingHistoryZone getBrowsingHistoryZone() { return browsingHistoryZone; }
    @JsonProperty("browsingHistoryZone")
    public void setBrowsingHistoryZone(BrowsingHistoryZone value) { this.browsingHistoryZone = value; }

    @JsonProperty("topZone5")
    public TopZone5 getTopZone5() { return topZone5; }
    @JsonProperty("topZone5")
    public void setTopZone5(TopZone5 value) { this.topZone5 = value; }

    @JsonProperty("topZone6")
    public TopZone6 getTopZone6() { return topZone6; }
    @JsonProperty("topZone6")
    public void setTopZone6(TopZone6 value) { this.topZone6 = value; }

    @JsonProperty("bottomZone2")
    public BottomZone2 getBottomZone2() { return bottomZone2; }
    @JsonProperty("bottomZone2")
    public void setBottomZone2(BottomZone2 value) { this.bottomZone2 = value; }

    @JsonProperty("INVALID")
    public Invalid getInvalid() { return invalid; }
    @JsonProperty("INVALID")
    public void setInvalid(Invalid value) { this.invalid = value; }
}
