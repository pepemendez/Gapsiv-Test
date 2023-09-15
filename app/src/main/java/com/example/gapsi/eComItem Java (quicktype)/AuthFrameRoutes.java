import com.fasterxml.jackson.annotation.*;

public class AuthFrameRoutes {
    private String frame;
    private String reauthFrame;
    private String gxoSignup;
    private String gxoSignin;

    @JsonProperty("frame")
    public String getFrame() { return frame; }
    @JsonProperty("frame")
    public void setFrame(String value) { this.frame = value; }

    @JsonProperty("reauthFrame")
    public String getReauthFrame() { return reauthFrame; }
    @JsonProperty("reauthFrame")
    public void setReauthFrame(String value) { this.reauthFrame = value; }

    @JsonProperty("gxoSignup")
    public String getGxoSignup() { return gxoSignup; }
    @JsonProperty("gxoSignup")
    public void setGxoSignup(String value) { this.gxoSignup = value; }

    @JsonProperty("gxoSignin")
    public String getGxoSignin() { return gxoSignin; }
    @JsonProperty("gxoSignin")
    public void setGxoSignin(String value) { this.gxoSignin = value; }
}
