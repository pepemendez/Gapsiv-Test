import com.fasterxml.jackson.annotation.*;

public class Group {
    private GroupTypename typename;
    private Name name;
    private Member[] members;

    @JsonProperty("__typename")
    public GroupTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(GroupTypename value) { this.typename = value; }

    @JsonProperty("name")
    public Name getName() { return name; }
    @JsonProperty("name")
    public void setName(Name value) { this.name = value; }

    @JsonProperty("members")
    public Member[] getMembers() { return members; }
    @JsonProperty("members")
    public void setMembers(Member[] value) { this.members = value; }
}
