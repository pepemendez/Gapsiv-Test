package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum FulfillmentType {
    FC, MARKETPLACE, STORE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FC: return "FC";
            case MARKETPLACE: return "MARKETPLACE";
            case STORE: return "STORE";
        }
        return null;
    }

    @JsonCreator
    public static FulfillmentType forValue(String value) throws IOException {
        if (value.equals("FC")) return FC;
        if (value.equals("MARKETPLACE")) return MARKETPLACE;
        if (value.equals("STORE")) return STORE;
        throw new IOException("Cannot deserialize FulfillmentType");
    }
}
