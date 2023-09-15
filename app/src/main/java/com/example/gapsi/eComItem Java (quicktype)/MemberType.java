import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MemberType {
    BADGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BADGE: return "badge";
        }
        return null;
    }

    @JsonCreator
    public static MemberType forValue(String value) throws IOException {
        if (value.equals("badge")) return BADGE;
        throw new IOException("Cannot deserialize MemberType");
    }
}
