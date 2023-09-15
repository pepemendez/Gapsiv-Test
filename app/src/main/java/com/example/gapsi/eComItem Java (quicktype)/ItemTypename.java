import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ItemTypename {
    AD_PLACEHOLDER, PRODUCT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AD_PLACEHOLDER: return "AdPlaceholder";
            case PRODUCT: return "Product";
        }
        return null;
    }

    @JsonCreator
    public static ItemTypename forValue(String value) throws IOException {
        if (value.equals("AdPlaceholder")) return AD_PLACEHOLDER;
        if (value.equals("Product")) return PRODUCT;
        throw new IOException("Cannot deserialize ItemTypename");
    }
}
