package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Gql {
    private GqlEndpointsByName endpointsByName;

    @JsonProperty("endpointsByName")
    public GqlEndpointsByName getEndpointsByName() { return endpointsByName; }
    @JsonProperty("endpointsByName")
    public void setEndpointsByName(GqlEndpointsByName value) { this.endpointsByName = value; }
}
