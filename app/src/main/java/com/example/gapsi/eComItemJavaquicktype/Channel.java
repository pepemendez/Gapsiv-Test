package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class Channel {
    private UUID id;
    private String status;

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }
}
