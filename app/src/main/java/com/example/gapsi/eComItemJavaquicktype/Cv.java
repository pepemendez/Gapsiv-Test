package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Cv {
    private CvAccount account;
    private Cart cart;
    private Bookslot bookslot;
    private CvHeader header;
    private Pulse pulse;
    private CvFooter footer;
    private Shared shared;
    private CvAds ads;
    private Search search;

    @JsonProperty("account")
    public CvAccount getAccount() { return account; }
    @JsonProperty("account")
    public void setAccount(CvAccount value) { this.account = value; }

    @JsonProperty("cart")
    public Cart getCart() { return cart; }
    @JsonProperty("cart")
    public void setCart(Cart value) { this.cart = value; }

    @JsonProperty("bookslot")
    public Bookslot getBookslot() { return bookslot; }
    @JsonProperty("bookslot")
    public void setBookslot(Bookslot value) { this.bookslot = value; }

    @JsonProperty("header")
    public CvHeader getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(CvHeader value) { this.header = value; }

    @JsonProperty("pulse")
    public Pulse getPulse() { return pulse; }
    @JsonProperty("pulse")
    public void setPulse(Pulse value) { this.pulse = value; }

    @JsonProperty("footer")
    public CvFooter getFooter() { return footer; }
    @JsonProperty("footer")
    public void setFooter(CvFooter value) { this.footer = value; }

    @JsonProperty("shared")
    public Shared getShared() { return shared; }
    @JsonProperty("shared")
    public void setShared(Shared value) { this.shared = value; }

    @JsonProperty("ads")
    public CvAds getAds() { return ads; }
    @JsonProperty("ads")
    public void setAds(CvAds value) { this.ads = value; }

    @JsonProperty("search")
    public Search getSearch() { return search; }
    @JsonProperty("search")
    public void setSearch(Search value) { this.search = value; }
}
