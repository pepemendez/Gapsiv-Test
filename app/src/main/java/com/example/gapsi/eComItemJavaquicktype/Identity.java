package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class Identity {
    private Context context;
    private AuthFrameRoutes authFrameRoutes;

    @JsonProperty("context")
    public Context getContext() { return context; }
    @JsonProperty("context")
    public void setContext(Context value) { this.context = value; }

    @JsonProperty("authFrameRoutes")
    public AuthFrameRoutes getAuthFrameRoutes() { return authFrameRoutes; }
    @JsonProperty("authFrameRoutes")
    public void setAuthFrameRoutes(AuthFrameRoutes value) { this.authFrameRoutes = value; }
}
