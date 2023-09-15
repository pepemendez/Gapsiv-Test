package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum MutationCancelOrder {
    CEACCOUNT, CECPH, CECXO, CEGATEWAY, CEORDERS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CEACCOUNT: return "ceaccount";
            case CECPH: return "cecph";
            case CECXO: return "cecxo";
            case CEGATEWAY: return "cegateway";
            case CEORDERS: return "ceorders";
        }
        return null;
    }

    @JsonCreator
    public static MutationCancelOrder forValue(String value) throws IOException {
        if (value.equals("ceaccount")) return CEACCOUNT;
        if (value.equals("cecph")) return CECPH;
        if (value.equals("cecxo")) return CECXO;
        if (value.equals("cegateway")) return CEGATEWAY;
        if (value.equals("ceorders")) return CEORDERS;
        throw new IOException("Cannot deserialize MutationCancelOrder");
    }
}
