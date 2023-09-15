import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClassName {
    DARK_GRAY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DARK_GRAY: return "dark-gray";
        }
        return null;
    }

    @JsonCreator
    public static ClassName forValue(String value) throws IOException {
        if (value.equals("dark-gray")) return DARK_GRAY;
        throw new IOException("Cannot deserialize ClassName");
    }
}
