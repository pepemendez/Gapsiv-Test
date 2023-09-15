import com.fasterxml.jackson.annotation.*;

public class ArExperiences {
    private boolean isARHome;
    private boolean isZeekit;
    private boolean isAROptical;

    @JsonProperty("isARHome")
    public boolean getIsARHome() { return isARHome; }
    @JsonProperty("isARHome")
    public void setIsARHome(boolean value) { this.isARHome = value; }

    @JsonProperty("isZeekit")
    public boolean getIsZeekit() { return isZeekit; }
    @JsonProperty("isZeekit")
    public void setIsZeekit(boolean value) { this.isZeekit = value; }

    @JsonProperty("isAROptical")
    public boolean getIsAROptical() { return isAROptical; }
    @JsonProperty("isAROptical")
    public void setIsAROptical(boolean value) { this.isAROptical = value; }
}
