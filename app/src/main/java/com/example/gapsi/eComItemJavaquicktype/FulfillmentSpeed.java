package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum FulfillmentSpeed {
    THE_2_DAYS, TOMORROW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_2_DAYS: return "2 days";
            case TOMORROW: return "TOMORROW";
        }
        return null;
    }

    @JsonCreator
    public static FulfillmentSpeed forValue(String value) throws IOException {
        if (value.equals("2 days")) return THE_2_DAYS;
        if (value.equals("TOMORROW")) return TOMORROW;
        throw new IOException("Cannot deserialize FulfillmentSpeed");
    }
}
