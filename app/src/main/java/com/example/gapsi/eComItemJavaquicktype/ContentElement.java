package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class ContentElement {
    private String type;
    private String flow;
    private ContentContent content;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("flow")
    public String getFlow() { return flow; }
    @JsonProperty("flow")
    public void setFlow(String value) { this.flow = value; }

    @JsonProperty("content")
    public ContentContent getContent() { return content; }
    @JsonProperty("content")
    public void setContent(ContentContent value) { this.content = value; }
}
