package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Context {
    private String signOutURL;
    private String signInPathname;
    private String createAccountPathname;
    private Tenant[] tenants;
    private boolean marketingEmails;
    private String rightsReservedText;
    private Object[] footerOptions;
    private String termsLink;
    private String privacyLink;

    @JsonProperty("signOutUrl")
    public String getSignOutURL() { return signOutURL; }
    @JsonProperty("signOutUrl")
    public void setSignOutURL(String value) { this.signOutURL = value; }

    @JsonProperty("signInPathname")
    public String getSignInPathname() { return signInPathname; }
    @JsonProperty("signInPathname")
    public void setSignInPathname(String value) { this.signInPathname = value; }

    @JsonProperty("createAccountPathname")
    public String getCreateAccountPathname() { return createAccountPathname; }
    @JsonProperty("createAccountPathname")
    public void setCreateAccountPathname(String value) { this.createAccountPathname = value; }

    @JsonProperty("tenants")
    public Tenant[] getTenants() { return tenants; }
    @JsonProperty("tenants")
    public void setTenants(Tenant[] value) { this.tenants = value; }

    @JsonProperty("marketingEmails")
    public boolean getMarketingEmails() { return marketingEmails; }
    @JsonProperty("marketingEmails")
    public void setMarketingEmails(boolean value) { this.marketingEmails = value; }

    @JsonProperty("rightsReservedText")
    public String getRightsReservedText() { return rightsReservedText; }
    @JsonProperty("rightsReservedText")
    public void setRightsReservedText(String value) { this.rightsReservedText = value; }

    @JsonProperty("footerOptions")
    public Object[] getFooterOptions() { return footerOptions; }
    @JsonProperty("footerOptions")
    public void setFooterOptions(Object[] value) { this.footerOptions = value; }

    @JsonProperty("termsLink")
    public String getTermsLink() { return termsLink; }
    @JsonProperty("termsLink")
    public void setTermsLink(String value) { this.termsLink = value; }

    @JsonProperty("privacyLink")
    public String getPrivacyLink() { return privacyLink; }
    @JsonProperty("privacyLink")
    public void setPrivacyLink(String value) { this.privacyLink = value; }
}
