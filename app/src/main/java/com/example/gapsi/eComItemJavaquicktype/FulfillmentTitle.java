package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum FulfillmentTitle {
    TITLE_SHIP_TO_HOME_NOT_AVAILABLE, TITLE_STORE_NOT_AVAILABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TITLE_SHIP_TO_HOME_NOT_AVAILABLE: return "title_shipToHome_not_available";
            case TITLE_STORE_NOT_AVAILABLE: return "title_store_not_available";
        }
        return null;
    }

    @JsonCreator
    public static FulfillmentTitle forValue(String value) throws IOException {
        if (value.equals("title_shipToHome_not_available")) return TITLE_SHIP_TO_HOME_NOT_AVAILABLE;
        if (value.equals("title_store_not_available")) return TITLE_STORE_NOT_AVAILABLE;
        throw new IOException("Cannot deserialize FulfillmentTitle");
    }
}
