import com.fasterxml.jackson.annotation.*;

public class CvAccount {
    private AccountAll all;

    @JsonProperty("_all_")
    public AccountAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(AccountAll value) { this.all = value; }
}
