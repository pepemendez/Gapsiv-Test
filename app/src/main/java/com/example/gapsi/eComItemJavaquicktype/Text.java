package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum Text {
    FREE_PICKUP, FREE_SHIPPING_ARRIVES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FREE_PICKUP: return "Free pickup ";
            case FREE_SHIPPING_ARRIVES: return "Free shipping, arrives ";
        }
        return null;
    }

    @JsonCreator
    public static Text forValue(String value) throws IOException {
        if (value.equals("Free pickup ")) return FREE_PICKUP;
        if (value.equals("Free shipping, arrives ")) return FREE_SHIPPING_ARRIVES;
        throw new IOException("Cannot deserialize Text");
    }
}
