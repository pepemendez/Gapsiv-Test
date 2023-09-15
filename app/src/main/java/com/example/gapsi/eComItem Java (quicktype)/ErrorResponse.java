import com.fasterxml.jackson.annotation.*;

public class ErrorResponse {
    private String correlationID;
    private String source;
    private Object[] errors;
    private Object errorCodes;

    @JsonProperty("correlationId")
    public String getCorrelationID() { return correlationID; }
    @JsonProperty("correlationId")
    public void setCorrelationID(String value) { this.correlationID = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("errors")
    public Object[] getErrors() { return errors; }
    @JsonProperty("errors")
    public void setErrors(Object[] value) { this.errors = value; }

    @JsonProperty("errorCodes")
    public Object getErrorCodes() { return errorCodes; }
    @JsonProperty("errorCodes")
    public void setErrorCodes(Object value) { this.errorCodes = value; }
}
