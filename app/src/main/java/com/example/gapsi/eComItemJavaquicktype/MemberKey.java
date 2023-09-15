package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum MemberKey {
    FF_PICKUP, FF_SHIPPING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FF_PICKUP: return "FF_PICKUP";
            case FF_SHIPPING: return "FF_SHIPPING";
        }
        return null;
    }

    @JsonCreator
    public static MemberKey forValue(String value) throws IOException {
        if (value.equals("FF_PICKUP")) return FF_PICKUP;
        if (value.equals("FF_SHIPPING")) return FF_SHIPPING;
        throw new IOException("Cannot deserialize MemberKey");
    }
}
