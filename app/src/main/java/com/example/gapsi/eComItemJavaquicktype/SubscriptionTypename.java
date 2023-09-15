package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum SubscriptionTypename {
    SUBSCRIPTION_DATA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SUBSCRIPTION_DATA: return "SubscriptionData";
        }
        return null;
    }

    @JsonCreator
    public static SubscriptionTypename forValue(String value) throws IOException {
        if (value.equals("SubscriptionData")) return SUBSCRIPTION_DATA;
        throw new IOException("Cannot deserialize SubscriptionTypename");
    }
}
