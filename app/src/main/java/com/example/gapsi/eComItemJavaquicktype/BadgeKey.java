package com.example.gapsi.eComItemJavaquicktype;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;

public enum BadgeKey {
    BESTSELLER, EMPTY, SOCIAL_PROOF_ATC_FLAG, SOCIAL_PROOF_PURCHASES_FLAG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BESTSELLER: return "BESTSELLER";
            case EMPTY: return "";
            case SOCIAL_PROOF_ATC_FLAG: return "SOCIAL_PROOF_ATC_FLAG";
            case SOCIAL_PROOF_PURCHASES_FLAG: return "SOCIAL_PROOF_PURCHASES_FLAG";
        }
        return null;
    }

    @JsonCreator
    public static BadgeKey forValue(String value) throws IOException {
        if (value.equals("BESTSELLER")) return BESTSELLER;
        if (value.equals("")) return EMPTY;
        if (value.equals("SOCIAL_PROOF_ATC_FLAG")) return SOCIAL_PROOF_ATC_FLAG;
        if (value.equals("SOCIAL_PROOF_PURCHASES_FLAG")) return SOCIAL_PROOF_PURCHASES_FLAG;
        throw new IOException("Cannot deserialize BadgeKey");
    }
}
