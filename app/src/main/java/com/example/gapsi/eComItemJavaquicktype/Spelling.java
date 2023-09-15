package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Spelling {
    private String correctedTerm;

    @JsonProperty("correctedTerm")
    public String getCorrectedTerm() { return correctedTerm; }
    @JsonProperty("correctedTerm")
    public void setCorrectedTerm(String value) { this.correctedTerm = value; }
}
