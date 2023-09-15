package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum ModuleTypename {
    TEMPO_MODULE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TEMPO_MODULE: return "TempoModule";
        }
        return null;
    }

    @JsonCreator
    public static ModuleTypename forValue(String value) throws IOException {
        if (value.equals("TempoModule")) return TEMPO_MODULE;
        throw new IOException("Cannot deserialize ModuleTypename");
    }
}
