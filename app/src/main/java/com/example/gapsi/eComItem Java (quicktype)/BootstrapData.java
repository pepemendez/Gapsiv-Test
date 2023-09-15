import com.fasterxml.jackson.annotation.*;

public class BootstrapData {
    private BootstrapDataAccount account;
    private BootstrapDataHeader header;
    private BootstrapDataFooter footer;
    private Cv cv;
    private Membership membership;

    @JsonProperty("account")
    public BootstrapDataAccount getAccount() { return account; }
    @JsonProperty("account")
    public void setAccount(BootstrapDataAccount value) { this.account = value; }

    @JsonProperty("header")
    public BootstrapDataHeader getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(BootstrapDataHeader value) { this.header = value; }

    @JsonProperty("footer")
    public BootstrapDataFooter getFooter() { return footer; }
    @JsonProperty("footer")
    public void setFooter(BootstrapDataFooter value) { this.footer = value; }

    @JsonProperty("cv")
    public Cv getCv() { return cv; }
    @JsonProperty("cv")
    public void setCv(Cv value) { this.cv = value; }

    @JsonProperty("membership")
    public Membership getMembership() { return membership; }
    @JsonProperty("membership")
    public void setMembership(Membership value) { this.membership = value; }
}
