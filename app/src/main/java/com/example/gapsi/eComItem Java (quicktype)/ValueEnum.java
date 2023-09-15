import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ValueEnum {
    IN_STOCK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IN_STOCK: return "IN_STOCK";
        }
        return null;
    }

    @JsonCreator
    public static ValueEnum forValue(String value) throws IOException {
        if (value.equals("IN_STOCK")) return IN_STOCK;
        throw new IOException("Cannot deserialize ValueEnum");
    }
}
