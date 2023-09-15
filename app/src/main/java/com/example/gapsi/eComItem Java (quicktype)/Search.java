import com.fasterxml.jackson.annotation.*;

public class Search {
    private SearchAll all;

    @JsonProperty("_all_")
    public SearchAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(SearchAll value) { this.all = value; }
}
