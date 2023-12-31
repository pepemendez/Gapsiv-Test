package com.example.gapsi.eComItemJavaquicktype;

import android.util.Log;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ECOMItem {
    private String responseStatus;
    private String responseMessage;
    private String sortStrategy;
    private String domainCode;
    private String keyword;
    private ECOMItemItem item;

    @JsonProperty("responseStatus")
    public String getResponseStatus() { return responseStatus; }
    @JsonProperty("responseStatus")
    public void setResponseStatus(String value) { this.responseStatus = value; }

    @JsonProperty("responseMessage")
    public String getResponseMessage() { return responseMessage; }
    @JsonProperty("responseMessage")
    public void setResponseMessage(String value) { this.responseMessage = value; }

    @JsonProperty("sortStrategy")
    public String getSortStrategy() { return sortStrategy; }
    @JsonProperty("sortStrategy")
    public void setSortStrategy(String value) { this.sortStrategy = value; }

    @JsonProperty("domainCode")
    public String getDomainCode() { return domainCode; }
    @JsonProperty("domainCode")
    public void setDomainCode(String value) { this.domainCode = value; }

    @JsonProperty("keyword")
    public String getKeyword() { return keyword; }
    @JsonProperty("keyword")
    public void setKeyword(String value) { this.keyword = value; }

    @JsonProperty("item")
    public ECOMItemItem getItem() { return item; }
    @JsonProperty("item")
    public void setItem(ECOMItemItem value) { this.item = value; }

    public List<ItemElement> getItemList(){
        ItemStackElement[] elements = item.getProps()
                .getPageProps()
                .getInitialData()
                .getSearchResult()
                .getItemStacks();

        for(ItemStackElement element:elements) {
            List<ItemElement> items = Arrays.asList(Arrays.stream(element.getItems())
                    .filter(x -> (x.getName() != null && !x.getName().isEmpty()))
                    .toArray(ItemElement[]::new));
            return items;
        }

        return new ArrayList<ItemElement>();
    }
}
