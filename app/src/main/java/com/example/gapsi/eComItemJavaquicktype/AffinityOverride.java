package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum AffinityOverride {
    DEFAULT, PILL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEFAULT: return "default";
            case PILL: return "pill";
        }
        return null;
    }

    @JsonCreator
    public static AffinityOverride forValue(String value) throws IOException {
        if (value.equals("default")) return DEFAULT;
        if (value.equals("pill")) return PILL;
        throw new IOException("Cannot deserialize AffinityOverride");
    }
}
