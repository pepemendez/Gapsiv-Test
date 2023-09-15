package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class InitialDataContentLayout {
    private TentacledModule[] modules;
    private LayoutElement[] layouts;
    private ContentLayoutPageMetadata pageMetadata;

    @JsonProperty("modules")
    public TentacledModule[] getModules() { return modules; }
    @JsonProperty("modules")
    public void setModules(TentacledModule[] value) { this.modules = value; }

    @JsonProperty("layouts")
    public LayoutElement[] getLayouts() { return layouts; }
    @JsonProperty("layouts")
    public void setLayouts(LayoutElement[] value) { this.layouts = value; }

    @JsonProperty("pageMetadata")
    public ContentLayoutPageMetadata getPageMetadata() { return pageMetadata; }
    @JsonProperty("pageMetadata")
    public void setPageMetadata(ContentLayoutPageMetadata value) { this.pageMetadata = value; }
}
