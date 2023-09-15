import com.fasterxml.jackson.annotation.*;

public class FluffyContentLayout {
    private FluffyModule[] modules;

    @JsonProperty("modules")
    public FluffyModule[] getModules() { return modules; }
    @JsonProperty("modules")
    public void setModules(FluffyModule[] value) { this.modules = value; }
}
