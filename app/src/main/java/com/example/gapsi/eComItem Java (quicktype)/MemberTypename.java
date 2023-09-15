import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MemberTypename {
    BADGE_GROUP_MEMBER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BADGE_GROUP_MEMBER: return "BadgeGroupMember";
        }
        return null;
    }

    @JsonCreator
    public static MemberTypename forValue(String value) throws IOException {
        if (value.equals("BadgeGroupMember")) return BADGE_GROUP_MEMBER;
        throw new IOException("Cannot deserialize MemberTypename");
    }
}
