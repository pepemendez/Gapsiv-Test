import com.fasterxml.jackson.annotation.*;

public class Operations {
    private MutationCancelOrder queryConfiguration;
    private MutationCancelOrder queryRewardsHistoryPage;
    private MutationCancelOrder queryContentPage;
    private MutationCancelOrder queryBrandPage;
    private MutationCancelOrder queryCheckItemCartEligibility;
    private MutationCancelOrder mutationMergeAndGetCart;
    private MutationCancelOrder queryGetGuestOrder;
    private MutationCancelOrder queryPurchaseHistory;
    private MutationCancelOrder mutationNotifyCapOneBannerSnooze;
    private MutationCancelOrder mutationCancelOrder;
    private MutationCancelOrder queryLastCallPage;
    private String queryAdV2Display;
    private MutationCancelOrder queryGetCommPreference;
    private MutationCancelOrder queryPurchasedProtectionPlans;
    private MutationCancelOrder queryPurchasedProtectionPlansV2;
    private MutationCancelOrder queryProtectionPlanDetail;
    private MutationCancelOrder querySubscriptions;
    private MutationCancelOrder queryNodeDetailQuery;
    private MutationCancelOrder queryNearbyNodesQuery;
    private MutationCancelOrder queryLocalStoreContentQuery;
    private MutationCancelOrder queryCartSubstitutions;
    private MutationCancelOrder queryCartShopSimilar;
    private MutationCancelOrder queryGetEarlyAccessLearnMoreData;
    private MutationCancelOrder queryPostCartLoadPage;
    private MutationCancelOrder querySearchStore;
    private MutationCancelOrder queryLocalStoreCategoryContent;
    private MutationCancelOrder queryNodeDetails;
    private MutationCancelOrder queryStoreFinderNearbyNodesQuery;
    private String mutationCreateInsuranceSalesLead;
    private MutationCancelOrder mutationSetPickup;
    private MutationCancelOrder queryGetCart;
    private MutationCancelOrder queryFeedShowCategories;
    private MutationCancelOrder queryFeedsByStatus;
    private MutationCancelOrder queryFeedShow;
    private MutationCancelOrder queryFeedsByStatusPaginated;
    private MutationCancelOrder querySavingsDashboard;
    private String mutationCancelReturnOrder;
    private MutationCancelOrder queryGetDeliveryPreferences;
    private String queryLensCustomizationProductIdmlQuery;

    @JsonProperty("query configuration")
    public MutationCancelOrder getQueryConfiguration() { return queryConfiguration; }
    @JsonProperty("query configuration")
    public void setQueryConfiguration(MutationCancelOrder value) { this.queryConfiguration = value; }

    @JsonProperty("query RewardsHistoryPage")
    public MutationCancelOrder getQueryRewardsHistoryPage() { return queryRewardsHistoryPage; }
    @JsonProperty("query RewardsHistoryPage")
    public void setQueryRewardsHistoryPage(MutationCancelOrder value) { this.queryRewardsHistoryPage = value; }

    @JsonProperty("query ContentPage")
    public MutationCancelOrder getQueryContentPage() { return queryContentPage; }
    @JsonProperty("query ContentPage")
    public void setQueryContentPage(MutationCancelOrder value) { this.queryContentPage = value; }

    @JsonProperty("query BrandPage")
    public MutationCancelOrder getQueryBrandPage() { return queryBrandPage; }
    @JsonProperty("query BrandPage")
    public void setQueryBrandPage(MutationCancelOrder value) { this.queryBrandPage = value; }

    @JsonProperty("query checkItemCartEligibility")
    public MutationCancelOrder getQueryCheckItemCartEligibility() { return queryCheckItemCartEligibility; }
    @JsonProperty("query checkItemCartEligibility")
    public void setQueryCheckItemCartEligibility(MutationCancelOrder value) { this.queryCheckItemCartEligibility = value; }

    @JsonProperty("mutation MergeAndGetCart")
    public MutationCancelOrder getMutationMergeAndGetCart() { return mutationMergeAndGetCart; }
    @JsonProperty("mutation MergeAndGetCart")
    public void setMutationMergeAndGetCart(MutationCancelOrder value) { this.mutationMergeAndGetCart = value; }

    @JsonProperty("query getGuestOrder")
    public MutationCancelOrder getQueryGetGuestOrder() { return queryGetGuestOrder; }
    @JsonProperty("query getGuestOrder")
    public void setQueryGetGuestOrder(MutationCancelOrder value) { this.queryGetGuestOrder = value; }

    @JsonProperty("query PurchaseHistory")
    public MutationCancelOrder getQueryPurchaseHistory() { return queryPurchaseHistory; }
    @JsonProperty("query PurchaseHistory")
    public void setQueryPurchaseHistory(MutationCancelOrder value) { this.queryPurchaseHistory = value; }

    @JsonProperty("mutation NotifyCapOneBannerSnooze")
    public MutationCancelOrder getMutationNotifyCapOneBannerSnooze() { return mutationNotifyCapOneBannerSnooze; }
    @JsonProperty("mutation NotifyCapOneBannerSnooze")
    public void setMutationNotifyCapOneBannerSnooze(MutationCancelOrder value) { this.mutationNotifyCapOneBannerSnooze = value; }

    @JsonProperty("mutation CancelOrder")
    public MutationCancelOrder getMutationCancelOrder() { return mutationCancelOrder; }
    @JsonProperty("mutation CancelOrder")
    public void setMutationCancelOrder(MutationCancelOrder value) { this.mutationCancelOrder = value; }

    @JsonProperty("query LastCallPage")
    public MutationCancelOrder getQueryLastCallPage() { return queryLastCallPage; }
    @JsonProperty("query LastCallPage")
    public void setQueryLastCallPage(MutationCancelOrder value) { this.queryLastCallPage = value; }

    @JsonProperty("query AdV2Display")
    public String getQueryAdV2Display() { return queryAdV2Display; }
    @JsonProperty("query AdV2Display")
    public void setQueryAdV2Display(String value) { this.queryAdV2Display = value; }

    @JsonProperty("query GetCommPreference")
    public MutationCancelOrder getQueryGetCommPreference() { return queryGetCommPreference; }
    @JsonProperty("query GetCommPreference")
    public void setQueryGetCommPreference(MutationCancelOrder value) { this.queryGetCommPreference = value; }

    @JsonProperty("query PurchasedProtectionPlans")
    public MutationCancelOrder getQueryPurchasedProtectionPlans() { return queryPurchasedProtectionPlans; }
    @JsonProperty("query PurchasedProtectionPlans")
    public void setQueryPurchasedProtectionPlans(MutationCancelOrder value) { this.queryPurchasedProtectionPlans = value; }

    @JsonProperty("query PurchasedProtectionPlansV2")
    public MutationCancelOrder getQueryPurchasedProtectionPlansV2() { return queryPurchasedProtectionPlansV2; }
    @JsonProperty("query PurchasedProtectionPlansV2")
    public void setQueryPurchasedProtectionPlansV2(MutationCancelOrder value) { this.queryPurchasedProtectionPlansV2 = value; }

    @JsonProperty("query ProtectionPlanDetail")
    public MutationCancelOrder getQueryProtectionPlanDetail() { return queryProtectionPlanDetail; }
    @JsonProperty("query ProtectionPlanDetail")
    public void setQueryProtectionPlanDetail(MutationCancelOrder value) { this.queryProtectionPlanDetail = value; }

    @JsonProperty("query subscriptions")
    public MutationCancelOrder getQuerySubscriptions() { return querySubscriptions; }
    @JsonProperty("query subscriptions")
    public void setQuerySubscriptions(MutationCancelOrder value) { this.querySubscriptions = value; }

    @JsonProperty("query NodeDetailQuery")
    public MutationCancelOrder getQueryNodeDetailQuery() { return queryNodeDetailQuery; }
    @JsonProperty("query NodeDetailQuery")
    public void setQueryNodeDetailQuery(MutationCancelOrder value) { this.queryNodeDetailQuery = value; }

    @JsonProperty("query NearbyNodesQuery")
    public MutationCancelOrder getQueryNearbyNodesQuery() { return queryNearbyNodesQuery; }
    @JsonProperty("query NearbyNodesQuery")
    public void setQueryNearbyNodesQuery(MutationCancelOrder value) { this.queryNearbyNodesQuery = value; }

    @JsonProperty("query LocalStoreContentQuery")
    public MutationCancelOrder getQueryLocalStoreContentQuery() { return queryLocalStoreContentQuery; }
    @JsonProperty("query LocalStoreContentQuery")
    public void setQueryLocalStoreContentQuery(MutationCancelOrder value) { this.queryLocalStoreContentQuery = value; }

    @JsonProperty("query CartSubstitutions")
    public MutationCancelOrder getQueryCartSubstitutions() { return queryCartSubstitutions; }
    @JsonProperty("query CartSubstitutions")
    public void setQueryCartSubstitutions(MutationCancelOrder value) { this.queryCartSubstitutions = value; }

    @JsonProperty("query CartShopSimilar")
    public MutationCancelOrder getQueryCartShopSimilar() { return queryCartShopSimilar; }
    @JsonProperty("query CartShopSimilar")
    public void setQueryCartShopSimilar(MutationCancelOrder value) { this.queryCartShopSimilar = value; }

    @JsonProperty("query GetEarlyAccessLearnMoreData")
    public MutationCancelOrder getQueryGetEarlyAccessLearnMoreData() { return queryGetEarlyAccessLearnMoreData; }
    @JsonProperty("query GetEarlyAccessLearnMoreData")
    public void setQueryGetEarlyAccessLearnMoreData(MutationCancelOrder value) { this.queryGetEarlyAccessLearnMoreData = value; }

    @JsonProperty("query PostCartLoadPage")
    public MutationCancelOrder getQueryPostCartLoadPage() { return queryPostCartLoadPage; }
    @JsonProperty("query PostCartLoadPage")
    public void setQueryPostCartLoadPage(MutationCancelOrder value) { this.queryPostCartLoadPage = value; }

    @JsonProperty("query SearchStore")
    public MutationCancelOrder getQuerySearchStore() { return querySearchStore; }
    @JsonProperty("query SearchStore")
    public void setQuerySearchStore(MutationCancelOrder value) { this.querySearchStore = value; }

    @JsonProperty("query LocalStoreCategoryContent")
    public MutationCancelOrder getQueryLocalStoreCategoryContent() { return queryLocalStoreCategoryContent; }
    @JsonProperty("query LocalStoreCategoryContent")
    public void setQueryLocalStoreCategoryContent(MutationCancelOrder value) { this.queryLocalStoreCategoryContent = value; }

    @JsonProperty("query nodeDetails")
    public MutationCancelOrder getQueryNodeDetails() { return queryNodeDetails; }
    @JsonProperty("query nodeDetails")
    public void setQueryNodeDetails(MutationCancelOrder value) { this.queryNodeDetails = value; }

    @JsonProperty("query storeFinderNearbyNodesQuery")
    public MutationCancelOrder getQueryStoreFinderNearbyNodesQuery() { return queryStoreFinderNearbyNodesQuery; }
    @JsonProperty("query storeFinderNearbyNodesQuery")
    public void setQueryStoreFinderNearbyNodesQuery(MutationCancelOrder value) { this.queryStoreFinderNearbyNodesQuery = value; }

    @JsonProperty("mutation CreateInsuranceSalesLead")
    public String getMutationCreateInsuranceSalesLead() { return mutationCreateInsuranceSalesLead; }
    @JsonProperty("mutation CreateInsuranceSalesLead")
    public void setMutationCreateInsuranceSalesLead(String value) { this.mutationCreateInsuranceSalesLead = value; }

    @JsonProperty("mutation setPickup")
    public MutationCancelOrder getMutationSetPickup() { return mutationSetPickup; }
    @JsonProperty("mutation setPickup")
    public void setMutationSetPickup(MutationCancelOrder value) { this.mutationSetPickup = value; }

    @JsonProperty("query getCart")
    public MutationCancelOrder getQueryGetCart() { return queryGetCart; }
    @JsonProperty("query getCart")
    public void setQueryGetCart(MutationCancelOrder value) { this.queryGetCart = value; }

    @JsonProperty("query feedShowCategories")
    public MutationCancelOrder getQueryFeedShowCategories() { return queryFeedShowCategories; }
    @JsonProperty("query feedShowCategories")
    public void setQueryFeedShowCategories(MutationCancelOrder value) { this.queryFeedShowCategories = value; }

    @JsonProperty("query feedsByStatus")
    public MutationCancelOrder getQueryFeedsByStatus() { return queryFeedsByStatus; }
    @JsonProperty("query feedsByStatus")
    public void setQueryFeedsByStatus(MutationCancelOrder value) { this.queryFeedsByStatus = value; }

    @JsonProperty("query feedShow")
    public MutationCancelOrder getQueryFeedShow() { return queryFeedShow; }
    @JsonProperty("query feedShow")
    public void setQueryFeedShow(MutationCancelOrder value) { this.queryFeedShow = value; }

    @JsonProperty("query feedsByStatusPaginated")
    public MutationCancelOrder getQueryFeedsByStatusPaginated() { return queryFeedsByStatusPaginated; }
    @JsonProperty("query feedsByStatusPaginated")
    public void setQueryFeedsByStatusPaginated(MutationCancelOrder value) { this.queryFeedsByStatusPaginated = value; }

    @JsonProperty("query SavingsDashboard")
    public MutationCancelOrder getQuerySavingsDashboard() { return querySavingsDashboard; }
    @JsonProperty("query SavingsDashboard")
    public void setQuerySavingsDashboard(MutationCancelOrder value) { this.querySavingsDashboard = value; }

    @JsonProperty("mutation cancelReturnOrder")
    public String getMutationCancelReturnOrder() { return mutationCancelReturnOrder; }
    @JsonProperty("mutation cancelReturnOrder")
    public void setMutationCancelReturnOrder(String value) { this.mutationCancelReturnOrder = value; }

    @JsonProperty("query GetDeliveryPreferences")
    public MutationCancelOrder getQueryGetDeliveryPreferences() { return queryGetDeliveryPreferences; }
    @JsonProperty("query GetDeliveryPreferences")
    public void setQueryGetDeliveryPreferences(MutationCancelOrder value) { this.queryGetDeliveryPreferences = value; }

    @JsonProperty("query LensCustomizationProductIdmlQuery")
    public String getQueryLensCustomizationProductIdmlQuery() { return queryLensCustomizationProductIdmlQuery; }
    @JsonProperty("query LensCustomizationProductIdmlQuery")
    public void setQueryLensCustomizationProductIdmlQuery(String value) { this.queryLensCustomizationProductIdmlQuery = value; }
}
