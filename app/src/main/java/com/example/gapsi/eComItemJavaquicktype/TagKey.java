package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum TagKey {
    SAVE_WITH_W_PLUS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SAVE_WITH_W_PLUS: return "SAVE_WITH_W_PLUS";
        }
        return null;
    }

    @JsonCreator
    public static TagKey forValue(String value) throws IOException {
        if (value.equals("SAVE_WITH_W_PLUS")) return SAVE_WITH_W_PLUS;
        throw new IOException("Cannot deserialize TagKey");
    }
}
