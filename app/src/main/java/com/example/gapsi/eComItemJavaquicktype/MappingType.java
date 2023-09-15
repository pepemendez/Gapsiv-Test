package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum MappingType {
    EXTERNAL, ZONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXTERNAL: return "EXTERNAL";
            case ZONE: return "ZONE";
        }
        return null;
    }

    @JsonCreator
    public static MappingType forValue(String value) throws IOException {
        if (value.equals("EXTERNAL")) return EXTERNAL;
        if (value.equals("ZONE")) return ZONE;
        throw new IOException("Cannot deserialize MappingType");
    }
}
