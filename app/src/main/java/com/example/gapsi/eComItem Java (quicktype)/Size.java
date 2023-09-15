import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Size {
    THE_290392;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_290392: return "290-392";
        }
        return null;
    }

    @JsonCreator
    public static Size forValue(String value) throws IOException {
        if (value.equals("290-392")) return THE_290392;
        throw new IOException("Cannot deserialize Size");
    }
}
