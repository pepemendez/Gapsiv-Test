package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Badges {
    private Badge[] flags;
    private Tag[] tags;
    private Group[] groups;

    @JsonProperty("flags")
    public Badge[] getFlags() { return flags; }
    @JsonProperty("flags")
    public void setFlags(Badge[] value) { this.flags = value; }

    @JsonProperty("tags")
    public Tag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tag[] value) { this.tags = value; }

    @JsonProperty("groups")
    public Group[] getGroups() { return groups; }
    @JsonProperty("groups")
    public void setGroups(Group[] value) { this.groups = value; }
}
