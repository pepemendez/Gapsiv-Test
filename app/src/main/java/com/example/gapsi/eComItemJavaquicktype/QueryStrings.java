package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class QueryStrings {
    private MutationCancelOrder stepCart;
    private MutationCancelOrder stepBookslot;
    private MutationCancelOrder entitytype;
    private MutationCancelOrder state;
    private MutationCancelOrder source;

    @JsonProperty("step=cart")
    public MutationCancelOrder getStepCart() { return stepCart; }
    @JsonProperty("step=cart")
    public void setStepCart(MutationCancelOrder value) { this.stepCart = value; }

    @JsonProperty("step=bookslot")
    public MutationCancelOrder getStepBookslot() { return stepBookslot; }
    @JsonProperty("step=bookslot")
    public void setStepBookslot(MutationCancelOrder value) { this.stepBookslot = value; }

    @JsonProperty("entitytype=*")
    public MutationCancelOrder getEntitytype() { return entitytype; }
    @JsonProperty("entitytype=*")
    public void setEntitytype(MutationCancelOrder value) { this.entitytype = value; }

    @JsonProperty("state=*")
    public MutationCancelOrder getState() { return state; }
    @JsonProperty("state=*")
    public void setState(MutationCancelOrder value) { this.state = value; }

    @JsonProperty("source=*")
    public MutationCancelOrder getSource() { return source; }
    @JsonProperty("source=*")
    public void setSource(MutationCancelOrder value) { this.source = value; }
}
