import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IsSfLink {
    FALSE, TRUE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FALSE: return "False";
            case TRUE: return "True";
        }
        return null;
    }

    @JsonCreator
    public static IsSfLink forValue(String value) throws IOException {
        if (value.equals("False")) return FALSE;
        if (value.equals("True")) return TRUE;
        throw new IOException("Cannot deserialize IsSfLink");
    }
}
