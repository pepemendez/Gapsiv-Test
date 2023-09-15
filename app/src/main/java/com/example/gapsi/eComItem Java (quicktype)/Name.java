import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Name {
    FULFILLMENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULFILLMENT: return "fulfillment";
        }
        return null;
    }

    @JsonCreator
    public static Name forValue(String value) throws IOException {
        if (value.equals("fulfillment")) return FULFILLMENT;
        throw new IOException("Cannot deserialize Name");
    }
}
