import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AvailabilityStatus {
    AVAILABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AVAILABLE: return "AVAILABLE";
        }
        return null;
    }

    @JsonCreator
    public static AvailabilityStatus forValue(String value) throws IOException {
        if (value.equals("AVAILABLE")) return AVAILABLE;
        throw new IOException("Cannot deserialize AvailabilityStatus");
    }
}
