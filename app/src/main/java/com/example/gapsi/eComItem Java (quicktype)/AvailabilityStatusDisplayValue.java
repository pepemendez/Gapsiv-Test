import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AvailabilityStatusDisplayValue {
    IN_STOCK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IN_STOCK: return "In stock";
        }
        return null;
    }

    @JsonCreator
    public static AvailabilityStatusDisplayValue forValue(String value) throws IOException {
        if (value.equals("In stock")) return IN_STOCK;
        throw new IOException("Cannot deserialize AvailabilityStatusDisplayValue");
    }
}
