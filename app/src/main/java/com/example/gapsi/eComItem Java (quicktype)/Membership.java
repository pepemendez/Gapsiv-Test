import com.fasterxml.jackson.annotation.*;

public class Membership {
    private MembershipData data;

    @JsonProperty("data")
    public MembershipData getData() { return data; }
    @JsonProperty("data")
    public void setData(MembershipData value) { this.data = value; }
}
