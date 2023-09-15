import com.fasterxml.jackson.annotation.*;

public class FooterAll {
    private boolean enableXOFeedback;
    private boolean hideGiveFeedbackSection;
    private boolean enableNativeAppDownloadBottomsheet;
    private boolean enableDBQrDownloadBottomSheet;
    private long timeIntervalInHoursNativeAppInstallPrompt;
    private String feedbackTenantName;
    private String dbQrDownloadBottomSheetSecondaryMessageText;
    private long timeIntervalInHoursDBQrNativeAppInstallBottomSheet;
    private boolean enableShopOurBrandsSection;
    private boolean isFullFooterEnabled;
    private long maxNumberOfDBQrDownloadBottomSheetViews;
    private boolean feedbackFetchMigrationToPlatformFetch;
    private boolean enableEmailSignup;
    private String dbQrDownloadBottomSheetPrimaryMessageText;
    private boolean enableQuickLinkSection;
    private boolean enableNativeAppDownloadStickyBanner;
    private boolean hideContactNumber;
    private boolean enableInStoreWifiAppPrompt;
    private boolean enablePrivacyLinkUpdate;
    private boolean enableForceB2BLogout;
    private long maxNumberOfNativeAppInstallPrompt;

    @JsonProperty("enableXOFeedback")
    public boolean getEnableXOFeedback() { return enableXOFeedback; }
    @JsonProperty("enableXOFeedback")
    public void setEnableXOFeedback(boolean value) { this.enableXOFeedback = value; }

    @JsonProperty("hideGiveFeedbackSection")
    public boolean getHideGiveFeedbackSection() { return hideGiveFeedbackSection; }
    @JsonProperty("hideGiveFeedbackSection")
    public void setHideGiveFeedbackSection(boolean value) { this.hideGiveFeedbackSection = value; }

    @JsonProperty("enableNativeAppDownloadBottomsheet")
    public boolean getEnableNativeAppDownloadBottomsheet() { return enableNativeAppDownloadBottomsheet; }
    @JsonProperty("enableNativeAppDownloadBottomsheet")
    public void setEnableNativeAppDownloadBottomsheet(boolean value) { this.enableNativeAppDownloadBottomsheet = value; }

    @JsonProperty("enableDbQrDownloadBottomSheet")
    public boolean getEnableDBQrDownloadBottomSheet() { return enableDBQrDownloadBottomSheet; }
    @JsonProperty("enableDbQrDownloadBottomSheet")
    public void setEnableDBQrDownloadBottomSheet(boolean value) { this.enableDBQrDownloadBottomSheet = value; }

    @JsonProperty("timeIntervalInHoursNativeAppInstallPrompt")
    public long getTimeIntervalInHoursNativeAppInstallPrompt() { return timeIntervalInHoursNativeAppInstallPrompt; }
    @JsonProperty("timeIntervalInHoursNativeAppInstallPrompt")
    public void setTimeIntervalInHoursNativeAppInstallPrompt(long value) { this.timeIntervalInHoursNativeAppInstallPrompt = value; }

    @JsonProperty("feedbackTenantName")
    public String getFeedbackTenantName() { return feedbackTenantName; }
    @JsonProperty("feedbackTenantName")
    public void setFeedbackTenantName(String value) { this.feedbackTenantName = value; }

    @JsonProperty("dbQrDownloadBottomSheetSecondaryMessageText")
    public String getDBQrDownloadBottomSheetSecondaryMessageText() { return dbQrDownloadBottomSheetSecondaryMessageText; }
    @JsonProperty("dbQrDownloadBottomSheetSecondaryMessageText")
    public void setDBQrDownloadBottomSheetSecondaryMessageText(String value) { this.dbQrDownloadBottomSheetSecondaryMessageText = value; }

    @JsonProperty("timeIntervalInHoursDbQrNativeAppInstallBottomSheet")
    public long getTimeIntervalInHoursDBQrNativeAppInstallBottomSheet() { return timeIntervalInHoursDBQrNativeAppInstallBottomSheet; }
    @JsonProperty("timeIntervalInHoursDbQrNativeAppInstallBottomSheet")
    public void setTimeIntervalInHoursDBQrNativeAppInstallBottomSheet(long value) { this.timeIntervalInHoursDBQrNativeAppInstallBottomSheet = value; }

    @JsonProperty("enableShopOurBrandsSection")
    public boolean getEnableShopOurBrandsSection() { return enableShopOurBrandsSection; }
    @JsonProperty("enableShopOurBrandsSection")
    public void setEnableShopOurBrandsSection(boolean value) { this.enableShopOurBrandsSection = value; }

    @JsonProperty("isFullFooterEnabled")
    public boolean getIsFullFooterEnabled() { return isFullFooterEnabled; }
    @JsonProperty("isFullFooterEnabled")
    public void setIsFullFooterEnabled(boolean value) { this.isFullFooterEnabled = value; }

    @JsonProperty("maxNumberOfDbQrDownloadBottomSheetViews")
    public long getMaxNumberOfDBQrDownloadBottomSheetViews() { return maxNumberOfDBQrDownloadBottomSheetViews; }
    @JsonProperty("maxNumberOfDbQrDownloadBottomSheetViews")
    public void setMaxNumberOfDBQrDownloadBottomSheetViews(long value) { this.maxNumberOfDBQrDownloadBottomSheetViews = value; }

    @JsonProperty("feedbackFetchMigrationToPlatformFetch")
    public boolean getFeedbackFetchMigrationToPlatformFetch() { return feedbackFetchMigrationToPlatformFetch; }
    @JsonProperty("feedbackFetchMigrationToPlatformFetch")
    public void setFeedbackFetchMigrationToPlatformFetch(boolean value) { this.feedbackFetchMigrationToPlatformFetch = value; }

    @JsonProperty("enableEmailSignup")
    public boolean getEnableEmailSignup() { return enableEmailSignup; }
    @JsonProperty("enableEmailSignup")
    public void setEnableEmailSignup(boolean value) { this.enableEmailSignup = value; }

    @JsonProperty("dbQrDownloadBottomSheetPrimaryMessageText")
    public String getDBQrDownloadBottomSheetPrimaryMessageText() { return dbQrDownloadBottomSheetPrimaryMessageText; }
    @JsonProperty("dbQrDownloadBottomSheetPrimaryMessageText")
    public void setDBQrDownloadBottomSheetPrimaryMessageText(String value) { this.dbQrDownloadBottomSheetPrimaryMessageText = value; }

    @JsonProperty("enableQuickLinkSection")
    public boolean getEnableQuickLinkSection() { return enableQuickLinkSection; }
    @JsonProperty("enableQuickLinkSection")
    public void setEnableQuickLinkSection(boolean value) { this.enableQuickLinkSection = value; }

    @JsonProperty("enableNativeAppDownloadStickyBanner")
    public boolean getEnableNativeAppDownloadStickyBanner() { return enableNativeAppDownloadStickyBanner; }
    @JsonProperty("enableNativeAppDownloadStickyBanner")
    public void setEnableNativeAppDownloadStickyBanner(boolean value) { this.enableNativeAppDownloadStickyBanner = value; }

    @JsonProperty("hideContactNumber")
    public boolean getHideContactNumber() { return hideContactNumber; }
    @JsonProperty("hideContactNumber")
    public void setHideContactNumber(boolean value) { this.hideContactNumber = value; }

    @JsonProperty("enableInStoreWifiAppPrompt")
    public boolean getEnableInStoreWifiAppPrompt() { return enableInStoreWifiAppPrompt; }
    @JsonProperty("enableInStoreWifiAppPrompt")
    public void setEnableInStoreWifiAppPrompt(boolean value) { this.enableInStoreWifiAppPrompt = value; }

    @JsonProperty("enablePrivacyLinkUpdate")
    public boolean getEnablePrivacyLinkUpdate() { return enablePrivacyLinkUpdate; }
    @JsonProperty("enablePrivacyLinkUpdate")
    public void setEnablePrivacyLinkUpdate(boolean value) { this.enablePrivacyLinkUpdate = value; }

    @JsonProperty("enableForceB2BLogout")
    public boolean getEnableForceB2BLogout() { return enableForceB2BLogout; }
    @JsonProperty("enableForceB2BLogout")
    public void setEnableForceB2BLogout(boolean value) { this.enableForceB2BLogout = value; }

    @JsonProperty("maxNumberOfNativeAppInstallPrompt")
    public long getMaxNumberOfNativeAppInstallPrompt() { return maxNumberOfNativeAppInstallPrompt; }
    @JsonProperty("maxNumberOfNativeAppInstallPrompt")
    public void setMaxNumberOfNativeAppInstallPrompt(long value) { this.maxNumberOfNativeAppInstallPrompt = value; }
}
