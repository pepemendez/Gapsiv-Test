package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ECOMItemItem {
    private String assetPrefix;
    private String[] dynamicIDS;
    private Query query;
    private boolean appGip;
    private String buildID;
    private String locale;
    private Props props;
    private boolean gip;
    private String defaultLocale;
    private String[] locales;
    private String page;
    private boolean isFallback;
    private boolean customServer;
    private RuntimeConfig runtimeConfig;
    private Object[] scriptLoader;

    @JsonProperty("assetPrefix")
    public String getAssetPrefix() { return assetPrefix; }
    @JsonProperty("assetPrefix")
    public void setAssetPrefix(String value) { this.assetPrefix = value; }

    @JsonProperty("dynamicIds")
    public String[] getDynamicIDS() { return dynamicIDS; }
    @JsonProperty("dynamicIds")
    public void setDynamicIDS(String[] value) { this.dynamicIDS = value; }

    @JsonProperty("query")
    public Query getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(Query value) { this.query = value; }

    @JsonProperty("appGip")
    public boolean getAppGip() { return appGip; }
    @JsonProperty("appGip")
    public void setAppGip(boolean value) { this.appGip = value; }

    @JsonProperty("buildId")
    public String getBuildID() { return buildID; }
    @JsonProperty("buildId")
    public void setBuildID(String value) { this.buildID = value; }

    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    @JsonProperty("props")
    public Props getProps() { return props; }
    @JsonProperty("props")
    public void setProps(Props value) { this.props = value; }

    @JsonProperty("gip")
    public boolean getGip() { return gip; }
    @JsonProperty("gip")
    public void setGip(boolean value) { this.gip = value; }

    @JsonProperty("defaultLocale")
    public String getDefaultLocale() { return defaultLocale; }
    @JsonProperty("defaultLocale")
    public void setDefaultLocale(String value) { this.defaultLocale = value; }

    @JsonProperty("locales")
    public String[] getLocales() { return locales; }
    @JsonProperty("locales")
    public void setLocales(String[] value) { this.locales = value; }

    @JsonProperty("page")
    public String getPage() { return page; }
    @JsonProperty("page")
    public void setPage(String value) { this.page = value; }

    @JsonProperty("isFallback")
    public boolean getIsFallback() { return isFallback; }
    @JsonProperty("isFallback")
    public void setIsFallback(boolean value) { this.isFallback = value; }

    @JsonProperty("customServer")
    public boolean getCustomServer() { return customServer; }
    @JsonProperty("customServer")
    public void setCustomServer(boolean value) { this.customServer = value; }

    @JsonProperty("runtimeConfig")
    public RuntimeConfig getRuntimeConfig() { return runtimeConfig; }
    @JsonProperty("runtimeConfig")
    public void setRuntimeConfig(RuntimeConfig value) { this.runtimeConfig = value; }

    @JsonProperty("scriptLoader")
    public Object[] getScriptLoader() { return scriptLoader; }
    @JsonProperty("scriptLoader")
    public void setScriptLoader(Object[] value) { this.scriptLoader = value; }
}
