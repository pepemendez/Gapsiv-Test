import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Flag {
    BEST_SELLER, EMPTY, IN_200_PEOPLE_S_CARTS, THE_100_BOUGHT_SINCE_YESTERDAY, THE_500_BOUGHT_SINCE_YESTERDAY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEST_SELLER: return "Best seller";
            case EMPTY: return "";
            case IN_200_PEOPLE_S_CARTS: return "In 200+ people's carts";
            case THE_100_BOUGHT_SINCE_YESTERDAY: return "100+ bought since yesterday";
            case THE_500_BOUGHT_SINCE_YESTERDAY: return "500+ bought since yesterday";
        }
        return null;
    }

    @JsonCreator
    public static Flag forValue(String value) throws IOException {
        if (value.equals("Best seller")) return BEST_SELLER;
        if (value.equals("")) return EMPTY;
        if (value.equals("In 200+ people's carts")) return IN_200_PEOPLE_S_CARTS;
        if (value.equals("100+ bought since yesterday")) return THE_100_BOUGHT_SINCE_YESTERDAY;
        if (value.equals("500+ bought since yesterday")) return THE_500_BOUGHT_SINCE_YESTERDAY;
        throw new IOException("Cannot deserialize Flag");
    }
}
