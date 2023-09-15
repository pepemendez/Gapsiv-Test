import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GroupTypename {
    UNIFIED_BADGE_GROUP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case UNIFIED_BADGE_GROUP: return "UnifiedBadgeGroup";
        }
        return null;
    }

    @JsonCreator
    public static GroupTypename forValue(String value) throws IOException {
        if (value.equals("UnifiedBadgeGroup")) return UNIFIED_BADGE_GROUP;
        throw new IOException("Cannot deserialize GroupTypename");
    }
}
