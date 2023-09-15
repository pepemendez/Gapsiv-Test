package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Vision {
    private Object ageGroup;
    private boolean visionCenterApproved;

    @JsonProperty("ageGroup")
    public Object getAgeGroup() { return ageGroup; }
    @JsonProperty("ageGroup")
    public void setAgeGroup(Object value) { this.ageGroup = value; }

    @JsonProperty("visionCenterApproved")
    public boolean getVisionCenterApproved() { return visionCenterApproved; }
    @JsonProperty("visionCenterApproved")
    public void setVisionCenterApproved(boolean value) { this.visionCenterApproved = value; }
}
