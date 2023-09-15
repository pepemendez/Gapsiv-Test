package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum MemberID {
    L1051, L1053;

    @JsonValue
    public String toValue() {
        switch (this) {
            case L1051: return "L1051";
            case L1053: return "L1053";
        }
        return null;
    }

    @JsonCreator
    public static MemberID forValue(String value) throws IOException {
        if (value.equals("L1051")) return L1051;
        if (value.equals("L1053")) return L1053;
        throw new IOException("Cannot deserialize MemberID");
    }
}
