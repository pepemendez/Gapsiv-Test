
package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

import java.io.IOException;

public enum BadgeType {
    EMPTY, LABEL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case LABEL: return "LABEL";
        }
        return null;
    }

    @JsonCreator
    public static BadgeType forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("LABEL")) return LABEL;
        throw new IOException("Cannot deserialize BadgeType");
    }
}
