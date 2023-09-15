package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;

public class RuntimeConfig {
    private String nxApplicationName;
    private boolean isDev;
    private boolean enableLatencyTrace;
    private String tenant;
    private String vid;
    private TenantV2 tenantV2;
    private String mockURL;
    private boolean mock;
    private EndpointMappings endpointMappings;
    private GoogleMaps googleMaps;
    private MembershipConfig membershipConfig;
    private PulseBeacon pulseBeacon;
    private PerimeterX perimeterX;
    private Identity identity;
    private ThreatMetrix threatMetrix;
    private String paymentsPageURL;
    private String paymentsChooserPageURL;
    private String walletPageURL;
    private RuntimeConfigAds ads;
    private String moatIvt;
    private String rewardsTravelURL;
    private String appVersion;
    private String appSHA;
    private String profile;
    private String tmxOrgID;
    private String dataCenter;
    private QueryContext queryContext;

    @JsonProperty("nxApplicationName")
    public String getNxApplicationName() { return nxApplicationName; }
    @JsonProperty("nxApplicationName")
    public void setNxApplicationName(String value) { this.nxApplicationName = value; }

    @JsonProperty("isDev")
    public boolean getIsDev() { return isDev; }
    @JsonProperty("isDev")
    public void setIsDev(boolean value) { this.isDev = value; }

    @JsonProperty("enableLatencyTrace")
    public boolean getEnableLatencyTrace() { return enableLatencyTrace; }
    @JsonProperty("enableLatencyTrace")
    public void setEnableLatencyTrace(boolean value) { this.enableLatencyTrace = value; }

    @JsonProperty("tenant")
    public String getTenant() { return tenant; }
    @JsonProperty("tenant")
    public void setTenant(String value) { this.tenant = value; }

    @JsonProperty("vid")
    public String getVid() { return vid; }
    @JsonProperty("vid")
    public void setVid(String value) { this.vid = value; }

    @JsonProperty("tenantV2")
    public TenantV2 getTenantV2() { return tenantV2; }
    @JsonProperty("tenantV2")
    public void setTenantV2(TenantV2 value) { this.tenantV2 = value; }

    @JsonProperty("mockURL")
    public String getMockURL() { return mockURL; }
    @JsonProperty("mockURL")
    public void setMockURL(String value) { this.mockURL = value; }

    @JsonProperty("mock")
    public boolean getMock() { return mock; }
    @JsonProperty("mock")
    public void setMock(boolean value) { this.mock = value; }

    @JsonProperty("endpointMappings")
    public EndpointMappings getEndpointMappings() { return endpointMappings; }
    @JsonProperty("endpointMappings")
    public void setEndpointMappings(EndpointMappings value) { this.endpointMappings = value; }

    @JsonProperty("googleMaps")
    public GoogleMaps getGoogleMaps() { return googleMaps; }
    @JsonProperty("googleMaps")
    public void setGoogleMaps(GoogleMaps value) { this.googleMaps = value; }

    @JsonProperty("membershipConfig")
    public MembershipConfig getMembershipConfig() { return membershipConfig; }
    @JsonProperty("membershipConfig")
    public void setMembershipConfig(MembershipConfig value) { this.membershipConfig = value; }

    @JsonProperty("pulseBeacon")
    public PulseBeacon getPulseBeacon() { return pulseBeacon; }
    @JsonProperty("pulseBeacon")
    public void setPulseBeacon(PulseBeacon value) { this.pulseBeacon = value; }

    @JsonProperty("perimeterX")
    public PerimeterX getPerimeterX() { return perimeterX; }
    @JsonProperty("perimeterX")
    public void setPerimeterX(PerimeterX value) { this.perimeterX = value; }

    @JsonProperty("identity")
    public Identity getIdentity() { return identity; }
    @JsonProperty("identity")
    public void setIdentity(Identity value) { this.identity = value; }

    @JsonProperty("threatMetrix")
    public ThreatMetrix getThreatMetrix() { return threatMetrix; }
    @JsonProperty("threatMetrix")
    public void setThreatMetrix(ThreatMetrix value) { this.threatMetrix = value; }

    @JsonProperty("paymentsPageUrl")
    public String getPaymentsPageURL() { return paymentsPageURL; }
    @JsonProperty("paymentsPageUrl")
    public void setPaymentsPageURL(String value) { this.paymentsPageURL = value; }

    @JsonProperty("paymentsChooserPageUrl")
    public String getPaymentsChooserPageURL() { return paymentsChooserPageURL; }
    @JsonProperty("paymentsChooserPageUrl")
    public void setPaymentsChooserPageURL(String value) { this.paymentsChooserPageURL = value; }

    @JsonProperty("walletPageUrl")
    public String getWalletPageURL() { return walletPageURL; }
    @JsonProperty("walletPageUrl")
    public void setWalletPageURL(String value) { this.walletPageURL = value; }

    @JsonProperty("ads")
    public RuntimeConfigAds getAds() { return ads; }
    @JsonProperty("ads")
    public void setAds(RuntimeConfigAds value) { this.ads = value; }

    @JsonProperty("moatIvt")
    public String getMoatIvt() { return moatIvt; }
    @JsonProperty("moatIvt")
    public void setMoatIvt(String value) { this.moatIvt = value; }

    @JsonProperty("rewardsTravelUrl")
    public String getRewardsTravelURL() { return rewardsTravelURL; }
    @JsonProperty("rewardsTravelUrl")
    public void setRewardsTravelURL(String value) { this.rewardsTravelURL = value; }

    @JsonProperty("appVersion")
    public String getAppVersion() { return appVersion; }
    @JsonProperty("appVersion")
    public void setAppVersion(String value) { this.appVersion = value; }

    @JsonProperty("appSha")
    public String getAppSHA() { return appSHA; }
    @JsonProperty("appSha")
    public void setAppSHA(String value) { this.appSHA = value; }

    @JsonProperty("profile")
    public String getProfile() { return profile; }
    @JsonProperty("profile")
    public void setProfile(String value) { this.profile = value; }

    @JsonProperty("tmxOrgId")
    public String getTmxOrgID() { return tmxOrgID; }
    @JsonProperty("tmxOrgId")
    public void setTmxOrgID(String value) { this.tmxOrgID = value; }

    @JsonProperty("dataCenter")
    public String getDataCenter() { return dataCenter; }
    @JsonProperty("dataCenter")
    public void setDataCenter(String value) { this.dataCenter = value; }

    @JsonProperty("queryContext")
    public QueryContext getQueryContext() { return queryContext; }
    @JsonProperty("queryContext")
    public void setQueryContext(QueryContext value) { this.queryContext = value; }
}
