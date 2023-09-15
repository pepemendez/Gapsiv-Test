import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Label {
    SAVE_WITH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SAVE_WITH: return "Save with";
        }
        return null;
    }

    @JsonCreator
    public static Label forValue(String value) throws IOException {
        if (value.equals("Save with")) return SAVE_WITH;
        throw new IOException("Cannot deserialize Label");
    }
}
