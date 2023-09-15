import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class PageProperties {
    private String ps;
    private String spelling;
    private String stores;
    private String grid;
    private String query;
    private String catID;
    private String sort;
    private boolean displayGuidedNav;
    private AffinityOverride affinityOverride;
    private String pageType;
    private ItemStacksInterleavePosition[] itemStacksInterleavePosition;
    private String prg;
    private long page;
    private Map<String, ItemStackValue> itemStacks;
    private String department;
    private PAP pap;

    @JsonProperty("ps")
    public String getPS() { return ps; }
    @JsonProperty("ps")
    public void setPS(String value) { this.ps = value; }

    @JsonProperty("spelling")
    public String getSpelling() { return spelling; }
    @JsonProperty("spelling")
    public void setSpelling(String value) { this.spelling = value; }

    @JsonProperty("stores")
    public String getStores() { return stores; }
    @JsonProperty("stores")
    public void setStores(String value) { this.stores = value; }

    @JsonProperty("grid")
    public String getGrid() { return grid; }
    @JsonProperty("grid")
    public void setGrid(String value) { this.grid = value; }

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("cat_id")
    public String getCatID() { return catID; }
    @JsonProperty("cat_id")
    public void setCatID(String value) { this.catID = value; }

    @JsonProperty("sort")
    public String getSort() { return sort; }
    @JsonProperty("sort")
    public void setSort(String value) { this.sort = value; }

    @JsonProperty("displayGuidedNav")
    public boolean getDisplayGuidedNav() { return displayGuidedNav; }
    @JsonProperty("displayGuidedNav")
    public void setDisplayGuidedNav(boolean value) { this.displayGuidedNav = value; }

    @JsonProperty("affinityOverride")
    public AffinityOverride getAffinityOverride() { return affinityOverride; }
    @JsonProperty("affinityOverride")
    public void setAffinityOverride(AffinityOverride value) { this.affinityOverride = value; }

    @JsonProperty("pageType")
    public String getPageType() { return pageType; }
    @JsonProperty("pageType")
    public void setPageType(String value) { this.pageType = value; }

    @JsonProperty("itemStacksInterleavePosition")
    public ItemStacksInterleavePosition[] getItemStacksInterleavePosition() { return itemStacksInterleavePosition; }
    @JsonProperty("itemStacksInterleavePosition")
    public void setItemStacksInterleavePosition(ItemStacksInterleavePosition[] value) { this.itemStacksInterleavePosition = value; }

    @JsonProperty("prg")
    public String getPrg() { return prg; }
    @JsonProperty("prg")
    public void setPrg(String value) { this.prg = value; }

    @JsonProperty("page")
    public long getPage() { return page; }
    @JsonProperty("page")
    public void setPage(long value) { this.page = value; }

    @JsonProperty("itemStacks")
    public Map<String, ItemStackValue> getItemStacks() { return itemStacks; }
    @JsonProperty("itemStacks")
    public void setItemStacks(Map<String, ItemStackValue> value) { this.itemStacks = value; }

    @JsonProperty("department")
    public String getDepartment() { return department; }
    @JsonProperty("department")
    public void setDepartment(String value) { this.department = value; }

    @JsonProperty("pap")
    public PAP getPAP() { return pap; }
    @JsonProperty("pap")
    public void setPAP(PAP value) { this.pap = value; }
}
