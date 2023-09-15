import com.fasterxml.jackson.annotation.*;

public class SubCategory {
    private SubCategorySubLink[] subLinks;

    @JsonProperty("subLinks")
    public SubCategorySubLink[] getSubLinks() { return subLinks; }
    @JsonProperty("subLinks")
    public void setSubLinks(SubCategorySubLink[] value) { this.subLinks = value; }
}
