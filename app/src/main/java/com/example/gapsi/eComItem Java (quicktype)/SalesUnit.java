import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SalesUnit {
    EACH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EACH: return "EACH";
        }
        return null;
    }

    @JsonCreator
    public static SalesUnit forValue(String value) throws IOException {
        if (value.equals("EACH")) return EACH;
        throw new IOException("Cannot deserialize SalesUnit");
    }
}
