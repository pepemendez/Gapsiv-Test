import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum UnitPrice {
    EMPTY, THE_79900_CA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case THE_79900_CA: return "$799.00/ca";
        }
        return null;
    }

    @JsonCreator
    public static UnitPrice forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("$799.00/ca")) return THE_79900_CA;
        throw new IOException("Cannot deserialize UnitPrice");
    }
}
