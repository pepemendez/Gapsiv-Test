import com.fasterxml.jackson.annotation.*;

public class Props {
    private PageProps pageProps;

    @JsonProperty("pageProps")
    public PageProps getPageProps() { return pageProps; }
    @JsonProperty("pageProps")
    public void setPageProps(PageProps value) { this.pageProps = value; }
}
