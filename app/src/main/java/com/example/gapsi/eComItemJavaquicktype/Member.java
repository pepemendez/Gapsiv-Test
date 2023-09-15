package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Member {
    private MemberTypename typename;
    private MemberID id;
    private MemberKey key;
    private MemberType memberType;
    private Object otherInfo;
    private long rank;
    private SlaText slaText;
    private StyleID styleID;
    private Text text;
    private BadgeType type;
    private Object templates;

    @JsonProperty("__typename")
    public MemberTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(MemberTypename value) { this.typename = value; }

    @JsonProperty("id")
    public MemberID getID() { return id; }
    @JsonProperty("id")
    public void setID(MemberID value) { this.id = value; }

    @JsonProperty("key")
    public MemberKey getKey() { return key; }
    @JsonProperty("key")
    public void setKey(MemberKey value) { this.key = value; }

    @JsonProperty("memberType")
    public MemberType getMemberType() { return memberType; }
    @JsonProperty("memberType")
    public void setMemberType(MemberType value) { this.memberType = value; }

    @JsonProperty("otherInfo")
    public Object getOtherInfo() { return otherInfo; }
    @JsonProperty("otherInfo")
    public void setOtherInfo(Object value) { this.otherInfo = value; }

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("slaText")
    public SlaText getSlaText() { return slaText; }
    @JsonProperty("slaText")
    public void setSlaText(SlaText value) { this.slaText = value; }

    @JsonProperty("styleId")
    public StyleID getStyleID() { return styleID; }
    @JsonProperty("styleId")
    public void setStyleID(StyleID value) { this.styleID = value; }

    @JsonProperty("text")
    public Text getText() { return text; }
    @JsonProperty("text")
    public void setText(Text value) { this.text = value; }

    @JsonProperty("type")
    public BadgeType getType() { return type; }
    @JsonProperty("type")
    public void setType(BadgeType value) { this.type = value; }

    @JsonProperty("templates")
    public Object getTemplates() { return templates; }
    @JsonProperty("templates")
    public void setTemplates(Object value) { this.templates = value; }
}
