import com.fasterxml.jackson.annotation.*;

public class Bookslot {
    private BookslotAll all;

    @JsonProperty("_all_")
    public BookslotAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(BookslotAll value) { this.all = value; }
}
