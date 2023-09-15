import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SlaText {
    IN_2_DAYS, IN_3_DAYS, TOMORROW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IN_2_DAYS: return "in 2 days";
            case IN_3_DAYS: return "in 3+ days";
            case TOMORROW: return "tomorrow";
        }
        return null;
    }

    @JsonCreator
    public static SlaText forValue(String value) throws IOException {
        if (value.equals("in 2 days")) return IN_2_DAYS;
        if (value.equals("in 3+ days")) return IN_3_DAYS;
        if (value.equals("tomorrow")) return TOMORROW;
        throw new IOException("Cannot deserialize SlaText");
    }
}
