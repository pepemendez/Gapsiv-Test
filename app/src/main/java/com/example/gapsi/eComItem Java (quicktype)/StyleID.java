import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StyleID {
    FF_STYLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FF_STYLE: return "FF_STYLE";
        }
        return null;
    }

    @JsonCreator
    public static StyleID forValue(String value) throws IOException {
        if (value.equals("FF_STYLE")) return FF_STYLE;
        throw new IOException("Cannot deserialize StyleID");
    }
}
