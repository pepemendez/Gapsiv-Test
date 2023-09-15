import com.fasterxml.jackson.annotation.*;

public class Schedule {
    private long priority;

    @JsonProperty("priority")
    public long getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(long value) { this.priority = value; }
}
