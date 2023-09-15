import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClickThroughType {
    URL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case URL: return "url";
        }
        return null;
    }

    @JsonCreator
    public static ClickThroughType forValue(String value) throws IOException {
        if (value.equals("url")) return URL;
        throw new IOException("Cannot deserialize ClickThroughType");
    }
}
