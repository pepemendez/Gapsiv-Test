import com.fasterxml.jackson.annotation.*;

public class Cart {
    private CartAll all;

    @JsonProperty("_all_")
    public CartAll getAll() { return all; }
    @JsonProperty("_all_")
    public void setAll(CartAll value) { this.all = value; }
}
