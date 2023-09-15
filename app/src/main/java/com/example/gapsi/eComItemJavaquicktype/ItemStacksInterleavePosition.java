package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ItemStacksInterleavePosition {
    private long stackID;

    @JsonProperty("stackId")
    public long getStackID() { return stackID; }
    @JsonProperty("stackId")
    public void setStackID(long value) { this.stackID = value; }
}
