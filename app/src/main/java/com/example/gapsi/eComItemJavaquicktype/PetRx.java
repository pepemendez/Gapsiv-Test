package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class PetRx {
    private boolean eligible;
    private Object singleDispense;

    @JsonProperty("eligible")
    public boolean getEligible() { return eligible; }
    @JsonProperty("eligible")
    public void setEligible(boolean value) { this.eligible = value; }

    @JsonProperty("singleDispense")
    public Object getSingleDispense() { return singleDispense; }
    @JsonProperty("singleDispense")
    public void setSingleDispense(Object value) { this.singleDispense = value; }
}
