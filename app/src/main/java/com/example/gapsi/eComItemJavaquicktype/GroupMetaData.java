package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class GroupMetaData {
    private Object groupType;
    private Object groupSubType;
    private long numberOfComponents;
    private Object groupComponents;

    @JsonProperty("groupType")
    public Object getGroupType() { return groupType; }
    @JsonProperty("groupType")
    public void setGroupType(Object value) { this.groupType = value; }

    @JsonProperty("groupSubType")
    public Object getGroupSubType() { return groupSubType; }
    @JsonProperty("groupSubType")
    public void setGroupSubType(Object value) { this.groupSubType = value; }

    @JsonProperty("numberOfComponents")
    public long getNumberOfComponents() { return numberOfComponents; }
    @JsonProperty("numberOfComponents")
    public void setNumberOfComponents(long value) { this.numberOfComponents = value; }

    @JsonProperty("groupComponents")
    public Object getGroupComponents() { return groupComponents; }
    @JsonProperty("groupComponents")
    public void setGroupComponents(Object value) { this.groupComponents = value; }
}
