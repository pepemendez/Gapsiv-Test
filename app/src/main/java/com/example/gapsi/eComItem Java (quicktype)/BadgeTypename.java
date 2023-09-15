import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BadgeTypename {
    BASE_BADGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BASE_BADGE: return "BaseBadge";
        }
        return null;
    }

    @JsonCreator
    public static BadgeTypename forValue(String value) throws IOException {
        if (value.equals("BaseBadge")) return BASE_BADGE;
        throw new IOException("Cannot deserialize BadgeTypename");
    }
}
