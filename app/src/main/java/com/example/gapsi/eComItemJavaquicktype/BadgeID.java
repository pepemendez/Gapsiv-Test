package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum BadgeID {
    EMPTY, L1102, L1103, L1600;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case L1102: return "L1102";
            case L1103: return "L1103";
            case L1600: return "L1600";
        }
        return null;
    }

    @JsonCreator
    public static BadgeID forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("L1102")) return L1102;
        if (value.equals("L1103")) return L1103;
        if (value.equals("L1600")) return L1600;
        throw new IOException("Cannot deserialize BadgeID");
    }
}
