package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum Source {
    CLASSIFIER, DICTIONARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLASSIFIER: return "classifier";
            case DICTIONARY: return "dictionary";
        }
        return null;
    }

    @JsonCreator
    public static Source forValue(String value) throws IOException {
        if (value.equals("classifier")) return CLASSIFIER;
        if (value.equals("dictionary")) return DICTIONARY;
        throw new IOException("Cannot deserialize Source");
    }
}
