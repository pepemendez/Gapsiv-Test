import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClassTypeEnum {
    REGULAR, SPONSORED_VIDEO_AD, VARIANT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REGULAR: return "REGULAR";
            case SPONSORED_VIDEO_AD: return "SponsoredVideoAd";
            case VARIANT: return "VARIANT";
        }
        return null;
    }

    @JsonCreator
    public static ClassTypeEnum forValue(String value) throws IOException {
        if (value.equals("REGULAR")) return REGULAR;
        if (value.equals("SponsoredVideoAd")) return SPONSORED_VIDEO_AD;
        if (value.equals("VARIANT")) return VARIANT;
        throw new IOException("Cannot deserialize ClassTypeEnum");
    }
}
