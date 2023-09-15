import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TagType {
    ICON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ICON: return "ICON";
        }
        return null;
    }

    @JsonCreator
    public static TagType forValue(String value) throws IOException {
        if (value.equals("ICON")) return ICON;
        throw new IOException("Cannot deserialize TagType");
    }
}
