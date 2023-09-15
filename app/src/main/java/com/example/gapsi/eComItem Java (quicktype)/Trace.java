import com.fasterxml.jackson.annotation.*;

public class Trace {
    private String traceID;
    private String spanID;
    private long traceFlags;

    @JsonProperty("traceId")
    public String getTraceID() { return traceID; }
    @JsonProperty("traceId")
    public void setTraceID(String value) { this.traceID = value; }

    @JsonProperty("spanId")
    public String getSpanID() { return spanID; }
    @JsonProperty("spanId")
    public void setSpanID(String value) { this.spanID = value; }

    @JsonProperty("traceFlags")
    public long getTraceFlags() { return traceFlags; }
    @JsonProperty("traceFlags")
    public void setTraceFlags(long value) { this.traceFlags = value; }
}
