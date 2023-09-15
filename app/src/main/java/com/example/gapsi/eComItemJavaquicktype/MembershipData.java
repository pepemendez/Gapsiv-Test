package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class MembershipData {
    private boolean shouldShowWplusLogo;

    @JsonProperty("shouldShowWplusLogo")
    public boolean getShouldShowWplusLogo() { return shouldShowWplusLogo; }
    @JsonProperty("shouldShowWplusLogo")
    public void setShouldShowWplusLogo(boolean value) { this.shouldShowWplusLogo = value; }
}
