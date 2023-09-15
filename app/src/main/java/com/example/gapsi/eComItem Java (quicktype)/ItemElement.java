import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class ItemElement {
    private ItemTypename typename;
    private AvailabilityStatusDisplayValue availabilityStatusDisplayValue;
    private String externalInfoURL;
    private String canonicalURL;
    private Boolean canAddToCart;
    private Boolean showOptions;
    private String description;
    private Flag flag;
    private Object[] fulfillmentBadges;
    private FulfillmentType fulfillmentType;
    private String id;
    private String usItemID;
    private String image;
    private Boolean isOutOfStock;
    private String name;
    private Long price;
    private PreOrder preOrder;
    private PriceInfo priceInfo;
    private Rating rating;
    private SalesUnit salesUnit;
    private ItemVariantList[] variantList;
    private Boolean isVariantTypeSwatch;
    private String offerID;
    private Boolean isAtfMarker;
    private String sellerID;
    private String sellerName;
    private SponsoredProduct sponsoredProduct;
    private Object quickShop;
    private Long numberOfReviews;
    private ImageInfo imageInfo;
    private ClassTypeEnum type;
    private Object moqText;
    private Boolean specialBuy;
    private Object pac;
    private Boolean priceFlip;
    private Boolean earlyAccessEvent;
    private FulfillmentIcon fulfillmentIcon;
    private GroupMetaData groupMetaData;
    private PetRx petRx;
    private Object pglsCondition;
    private Object preownedCondition;
    private String imageName;
    private FulfillmentBadgeGroup[] fulfillmentBadgeGroups;
    private Long weightIncrement;
    private String shortDescription;
    private Boolean isEarlyAccessItem;
    private FulfillmentTitle fulfillmentTitle;
    private Boolean buyBoxSuppression;
    private Vision vision;
    private Badge badge;
    private ClassTypeEnum classType;
    private Boolean annualEventV2;
    private Object rewards;
    private Boolean seeShippingEligibility;
    private Object itemType;
    private Object topResult;
    private Object isPreowned;
    private String imageID;
    private AspectInfo aspectInfo;
    private Object externalInfo;
    private VariantCriterion[] variantCriteria;
    private ProductLocation[] productLocation;
    private Subscription subscription;
    private SalesUnit salesUnitType;
    private Long additionalOfferCount;
    private Boolean isSponsoredFlag;
    private Double averageRating;
    private ArExperiences arExperiences;
    private FulfillmentSummary[] fulfillmentSummary;
    private Boolean hasCarePlans;
    private Size imageSize;
    private Object promoDiscount;
    private Object quickShopCTALabel;
    private Boolean checkStoreAvailabilityATC;
    private EventAttributes eventAttributes;
    private Boolean showAtc;
    private Boolean similarItems;
    private Object newConditionProductID;
    private Object[] keyAttributes;
    private Boolean annualEvent;
    private Badges badges;
    private Boolean snapEligible;
    private Boolean showBuyNow;
    private Object showExploreOtherConditionsCTA;
    private AvailabilityStatusV2 availabilityStatusV2;
    private Category category;
    private Boolean shouldLazyLoad;
    private String productLocationDisplayValue;
    private FulfillmentSpeed[] fulfillmentSpeed;
    private String displayName;
    private Boolean hasVideo;
    private UUID adUUID;
    private String lazy;
    private String moduleInfo;
    private String moduleLocation;

    @JsonProperty("__typename")
    public ItemTypename getTypename() { return typename; }
    @JsonProperty("__typename")
    public void setTypename(ItemTypename value) { this.typename = value; }

    @JsonProperty("availabilityStatusDisplayValue")
    public AvailabilityStatusDisplayValue getAvailabilityStatusDisplayValue() { return availabilityStatusDisplayValue; }
    @JsonProperty("availabilityStatusDisplayValue")
    public void setAvailabilityStatusDisplayValue(AvailabilityStatusDisplayValue value) { this.availabilityStatusDisplayValue = value; }

    @JsonProperty("externalInfoUrl")
    public String getExternalInfoURL() { return externalInfoURL; }
    @JsonProperty("externalInfoUrl")
    public void setExternalInfoURL(String value) { this.externalInfoURL = value; }

    @JsonProperty("canonicalUrl")
    public String getCanonicalURL() { return canonicalURL; }
    @JsonProperty("canonicalUrl")
    public void setCanonicalURL(String value) { this.canonicalURL = value; }

    @JsonProperty("canAddToCart")
    public Boolean getCanAddToCart() { return canAddToCart; }
    @JsonProperty("canAddToCart")
    public void setCanAddToCart(Boolean value) { this.canAddToCart = value; }

    @JsonProperty("showOptions")
    public Boolean getShowOptions() { return showOptions; }
    @JsonProperty("showOptions")
    public void setShowOptions(Boolean value) { this.showOptions = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("flag")
    public Flag getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(Flag value) { this.flag = value; }

    @JsonProperty("fulfillmentBadges")
    public Object[] getFulfillmentBadges() { return fulfillmentBadges; }
    @JsonProperty("fulfillmentBadges")
    public void setFulfillmentBadges(Object[] value) { this.fulfillmentBadges = value; }

    @JsonProperty("fulfillmentType")
    public FulfillmentType getFulfillmentType() { return fulfillmentType; }
    @JsonProperty("fulfillmentType")
    public void setFulfillmentType(FulfillmentType value) { this.fulfillmentType = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("usItemId")
    public String getUsItemID() { return usItemID; }
    @JsonProperty("usItemId")
    public void setUsItemID(String value) { this.usItemID = value; }

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("isOutOfStock")
    public Boolean getIsOutOfStock() { return isOutOfStock; }
    @JsonProperty("isOutOfStock")
    public void setIsOutOfStock(Boolean value) { this.isOutOfStock = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("price")
    public Long getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(Long value) { this.price = value; }

    @JsonProperty("preOrder")
    public PreOrder getPreOrder() { return preOrder; }
    @JsonProperty("preOrder")
    public void setPreOrder(PreOrder value) { this.preOrder = value; }

    @JsonProperty("priceInfo")
    public PriceInfo getPriceInfo() { return priceInfo; }
    @JsonProperty("priceInfo")
    public void setPriceInfo(PriceInfo value) { this.priceInfo = value; }

    @JsonProperty("rating")
    public Rating getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(Rating value) { this.rating = value; }

    @JsonProperty("salesUnit")
    public SalesUnit getSalesUnit() { return salesUnit; }
    @JsonProperty("salesUnit")
    public void setSalesUnit(SalesUnit value) { this.salesUnit = value; }

    @JsonProperty("variantList")
    public ItemVariantList[] getVariantList() { return variantList; }
    @JsonProperty("variantList")
    public void setVariantList(ItemVariantList[] value) { this.variantList = value; }

    @JsonProperty("isVariantTypeSwatch")
    public Boolean getIsVariantTypeSwatch() { return isVariantTypeSwatch; }
    @JsonProperty("isVariantTypeSwatch")
    public void setIsVariantTypeSwatch(Boolean value) { this.isVariantTypeSwatch = value; }

    @JsonProperty("offerId")
    public String getOfferID() { return offerID; }
    @JsonProperty("offerId")
    public void setOfferID(String value) { this.offerID = value; }

    @JsonProperty("isAtfMarker")
    public Boolean getIsAtfMarker() { return isAtfMarker; }
    @JsonProperty("isAtfMarker")
    public void setIsAtfMarker(Boolean value) { this.isAtfMarker = value; }

    @JsonProperty("sellerId")
    public String getSellerID() { return sellerID; }
    @JsonProperty("sellerId")
    public void setSellerID(String value) { this.sellerID = value; }

    @JsonProperty("sellerName")
    public String getSellerName() { return sellerName; }
    @JsonProperty("sellerName")
    public void setSellerName(String value) { this.sellerName = value; }

    @JsonProperty("sponsoredProduct")
    public SponsoredProduct getSponsoredProduct() { return sponsoredProduct; }
    @JsonProperty("sponsoredProduct")
    public void setSponsoredProduct(SponsoredProduct value) { this.sponsoredProduct = value; }

    @JsonProperty("quickShop")
    public Object getQuickShop() { return quickShop; }
    @JsonProperty("quickShop")
    public void setQuickShop(Object value) { this.quickShop = value; }

    @JsonProperty("numberOfReviews")
    public Long getNumberOfReviews() { return numberOfReviews; }
    @JsonProperty("numberOfReviews")
    public void setNumberOfReviews(Long value) { this.numberOfReviews = value; }

    @JsonProperty("imageInfo")
    public ImageInfo getImageInfo() { return imageInfo; }
    @JsonProperty("imageInfo")
    public void setImageInfo(ImageInfo value) { this.imageInfo = value; }

    @JsonProperty("type")
    public ClassTypeEnum getType() { return type; }
    @JsonProperty("type")
    public void setType(ClassTypeEnum value) { this.type = value; }

    @JsonProperty("moqText")
    public Object getMoqText() { return moqText; }
    @JsonProperty("moqText")
    public void setMoqText(Object value) { this.moqText = value; }

    @JsonProperty("specialBuy")
    public Boolean getSpecialBuy() { return specialBuy; }
    @JsonProperty("specialBuy")
    public void setSpecialBuy(Boolean value) { this.specialBuy = value; }

    @JsonProperty("pac")
    public Object getPac() { return pac; }
    @JsonProperty("pac")
    public void setPac(Object value) { this.pac = value; }

    @JsonProperty("priceFlip")
    public Boolean getPriceFlip() { return priceFlip; }
    @JsonProperty("priceFlip")
    public void setPriceFlip(Boolean value) { this.priceFlip = value; }

    @JsonProperty("earlyAccessEvent")
    public Boolean getEarlyAccessEvent() { return earlyAccessEvent; }
    @JsonProperty("earlyAccessEvent")
    public void setEarlyAccessEvent(Boolean value) { this.earlyAccessEvent = value; }

    @JsonProperty("fulfillmentIcon")
    public FulfillmentIcon getFulfillmentIcon() { return fulfillmentIcon; }
    @JsonProperty("fulfillmentIcon")
    public void setFulfillmentIcon(FulfillmentIcon value) { this.fulfillmentIcon = value; }

    @JsonProperty("groupMetaData")
    public GroupMetaData getGroupMetaData() { return groupMetaData; }
    @JsonProperty("groupMetaData")
    public void setGroupMetaData(GroupMetaData value) { this.groupMetaData = value; }

    @JsonProperty("petRx")
    public PetRx getPetRx() { return petRx; }
    @JsonProperty("petRx")
    public void setPetRx(PetRx value) { this.petRx = value; }

    @JsonProperty("pglsCondition")
    public Object getPglsCondition() { return pglsCondition; }
    @JsonProperty("pglsCondition")
    public void setPglsCondition(Object value) { this.pglsCondition = value; }

    @JsonProperty("preownedCondition")
    public Object getPreownedCondition() { return preownedCondition; }
    @JsonProperty("preownedCondition")
    public void setPreownedCondition(Object value) { this.preownedCondition = value; }

    @JsonProperty("imageName")
    public String getImageName() { return imageName; }
    @JsonProperty("imageName")
    public void setImageName(String value) { this.imageName = value; }

    @JsonProperty("fulfillmentBadgeGroups")
    public FulfillmentBadgeGroup[] getFulfillmentBadgeGroups() { return fulfillmentBadgeGroups; }
    @JsonProperty("fulfillmentBadgeGroups")
    public void setFulfillmentBadgeGroups(FulfillmentBadgeGroup[] value) { this.fulfillmentBadgeGroups = value; }

    @JsonProperty("weightIncrement")
    public Long getWeightIncrement() { return weightIncrement; }
    @JsonProperty("weightIncrement")
    public void setWeightIncrement(Long value) { this.weightIncrement = value; }

    @JsonProperty("shortDescription")
    public String getShortDescription() { return shortDescription; }
    @JsonProperty("shortDescription")
    public void setShortDescription(String value) { this.shortDescription = value; }

    @JsonProperty("isEarlyAccessItem")
    public Boolean getIsEarlyAccessItem() { return isEarlyAccessItem; }
    @JsonProperty("isEarlyAccessItem")
    public void setIsEarlyAccessItem(Boolean value) { this.isEarlyAccessItem = value; }

    @JsonProperty("fulfillmentTitle")
    public FulfillmentTitle getFulfillmentTitle() { return fulfillmentTitle; }
    @JsonProperty("fulfillmentTitle")
    public void setFulfillmentTitle(FulfillmentTitle value) { this.fulfillmentTitle = value; }

    @JsonProperty("buyBoxSuppression")
    public Boolean getBuyBoxSuppression() { return buyBoxSuppression; }
    @JsonProperty("buyBoxSuppression")
    public void setBuyBoxSuppression(Boolean value) { this.buyBoxSuppression = value; }

    @JsonProperty("vision")
    public Vision getVision() { return vision; }
    @JsonProperty("vision")
    public void setVision(Vision value) { this.vision = value; }

    @JsonProperty("badge")
    public Badge getBadge() { return badge; }
    @JsonProperty("badge")
    public void setBadge(Badge value) { this.badge = value; }

    @JsonProperty("classType")
    public ClassTypeEnum getClassType() { return classType; }
    @JsonProperty("classType")
    public void setClassType(ClassTypeEnum value) { this.classType = value; }

    @JsonProperty("annualEventV2")
    public Boolean getAnnualEventV2() { return annualEventV2; }
    @JsonProperty("annualEventV2")
    public void setAnnualEventV2(Boolean value) { this.annualEventV2 = value; }

    @JsonProperty("rewards")
    public Object getRewards() { return rewards; }
    @JsonProperty("rewards")
    public void setRewards(Object value) { this.rewards = value; }

    @JsonProperty("seeShippingEligibility")
    public Boolean getSeeShippingEligibility() { return seeShippingEligibility; }
    @JsonProperty("seeShippingEligibility")
    public void setSeeShippingEligibility(Boolean value) { this.seeShippingEligibility = value; }

    @JsonProperty("itemType")
    public Object getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(Object value) { this.itemType = value; }

    @JsonProperty("topResult")
    public Object getTopResult() { return topResult; }
    @JsonProperty("topResult")
    public void setTopResult(Object value) { this.topResult = value; }

    @JsonProperty("isPreowned")
    public Object getIsPreowned() { return isPreowned; }
    @JsonProperty("isPreowned")
    public void setIsPreowned(Object value) { this.isPreowned = value; }

    @JsonProperty("imageID")
    public String getImageID() { return imageID; }
    @JsonProperty("imageID")
    public void setImageID(String value) { this.imageID = value; }

    @JsonProperty("aspectInfo")
    public AspectInfo getAspectInfo() { return aspectInfo; }
    @JsonProperty("aspectInfo")
    public void setAspectInfo(AspectInfo value) { this.aspectInfo = value; }

    @JsonProperty("externalInfo")
    public Object getExternalInfo() { return externalInfo; }
    @JsonProperty("externalInfo")
    public void setExternalInfo(Object value) { this.externalInfo = value; }

    @JsonProperty("variantCriteria")
    public VariantCriterion[] getVariantCriteria() { return variantCriteria; }
    @JsonProperty("variantCriteria")
    public void setVariantCriteria(VariantCriterion[] value) { this.variantCriteria = value; }

    @JsonProperty("productLocation")
    public ProductLocation[] getProductLocation() { return productLocation; }
    @JsonProperty("productLocation")
    public void setProductLocation(ProductLocation[] value) { this.productLocation = value; }

    @JsonProperty("subscription")
    public Subscription getSubscription() { return subscription; }
    @JsonProperty("subscription")
    public void setSubscription(Subscription value) { this.subscription = value; }

    @JsonProperty("salesUnitType")
    public SalesUnit getSalesUnitType() { return salesUnitType; }
    @JsonProperty("salesUnitType")
    public void setSalesUnitType(SalesUnit value) { this.salesUnitType = value; }

    @JsonProperty("additionalOfferCount")
    public Long getAdditionalOfferCount() { return additionalOfferCount; }
    @JsonProperty("additionalOfferCount")
    public void setAdditionalOfferCount(Long value) { this.additionalOfferCount = value; }

    @JsonProperty("isSponsoredFlag")
    public Boolean getIsSponsoredFlag() { return isSponsoredFlag; }
    @JsonProperty("isSponsoredFlag")
    public void setIsSponsoredFlag(Boolean value) { this.isSponsoredFlag = value; }

    @JsonProperty("averageRating")
    public Double getAverageRating() { return averageRating; }
    @JsonProperty("averageRating")
    public void setAverageRating(Double value) { this.averageRating = value; }

    @JsonProperty("arExperiences")
    public ArExperiences getArExperiences() { return arExperiences; }
    @JsonProperty("arExperiences")
    public void setArExperiences(ArExperiences value) { this.arExperiences = value; }

    @JsonProperty("fulfillmentSummary")
    public FulfillmentSummary[] getFulfillmentSummary() { return fulfillmentSummary; }
    @JsonProperty("fulfillmentSummary")
    public void setFulfillmentSummary(FulfillmentSummary[] value) { this.fulfillmentSummary = value; }

    @JsonProperty("hasCarePlans")
    public Boolean getHasCarePlans() { return hasCarePlans; }
    @JsonProperty("hasCarePlans")
    public void setHasCarePlans(Boolean value) { this.hasCarePlans = value; }

    @JsonProperty("imageSize")
    public Size getImageSize() { return imageSize; }
    @JsonProperty("imageSize")
    public void setImageSize(Size value) { this.imageSize = value; }

    @JsonProperty("promoDiscount")
    public Object getPromoDiscount() { return promoDiscount; }
    @JsonProperty("promoDiscount")
    public void setPromoDiscount(Object value) { this.promoDiscount = value; }

    @JsonProperty("quickShopCTALabel")
    public Object getQuickShopCTALabel() { return quickShopCTALabel; }
    @JsonProperty("quickShopCTALabel")
    public void setQuickShopCTALabel(Object value) { this.quickShopCTALabel = value; }

    @JsonProperty("checkStoreAvailabilityATC")
    public Boolean getCheckStoreAvailabilityATC() { return checkStoreAvailabilityATC; }
    @JsonProperty("checkStoreAvailabilityATC")
    public void setCheckStoreAvailabilityATC(Boolean value) { this.checkStoreAvailabilityATC = value; }

    @JsonProperty("eventAttributes")
    public EventAttributes getEventAttributes() { return eventAttributes; }
    @JsonProperty("eventAttributes")
    public void setEventAttributes(EventAttributes value) { this.eventAttributes = value; }

    @JsonProperty("showAtc")
    public Boolean getShowAtc() { return showAtc; }
    @JsonProperty("showAtc")
    public void setShowAtc(Boolean value) { this.showAtc = value; }

    @JsonProperty("similarItems")
    public Boolean getSimilarItems() { return similarItems; }
    @JsonProperty("similarItems")
    public void setSimilarItems(Boolean value) { this.similarItems = value; }

    @JsonProperty("newConditionProductId")
    public Object getNewConditionProductID() { return newConditionProductID; }
    @JsonProperty("newConditionProductId")
    public void setNewConditionProductID(Object value) { this.newConditionProductID = value; }

    @JsonProperty("keyAttributes")
    public Object[] getKeyAttributes() { return keyAttributes; }
    @JsonProperty("keyAttributes")
    public void setKeyAttributes(Object[] value) { this.keyAttributes = value; }

    @JsonProperty("annualEvent")
    public Boolean getAnnualEvent() { return annualEvent; }
    @JsonProperty("annualEvent")
    public void setAnnualEvent(Boolean value) { this.annualEvent = value; }

    @JsonProperty("badges")
    public Badges getBadges() { return badges; }
    @JsonProperty("badges")
    public void setBadges(Badges value) { this.badges = value; }

    @JsonProperty("snapEligible")
    public Boolean getSnapEligible() { return snapEligible; }
    @JsonProperty("snapEligible")
    public void setSnapEligible(Boolean value) { this.snapEligible = value; }

    @JsonProperty("showBuyNow")
    public Boolean getShowBuyNow() { return showBuyNow; }
    @JsonProperty("showBuyNow")
    public void setShowBuyNow(Boolean value) { this.showBuyNow = value; }

    @JsonProperty("showExploreOtherConditionsCTA")
    public Object getShowExploreOtherConditionsCTA() { return showExploreOtherConditionsCTA; }
    @JsonProperty("showExploreOtherConditionsCTA")
    public void setShowExploreOtherConditionsCTA(Object value) { this.showExploreOtherConditionsCTA = value; }

    @JsonProperty("availabilityStatusV2")
    public AvailabilityStatusV2 getAvailabilityStatusV2() { return availabilityStatusV2; }
    @JsonProperty("availabilityStatusV2")
    public void setAvailabilityStatusV2(AvailabilityStatusV2 value) { this.availabilityStatusV2 = value; }

    @JsonProperty("category")
    public Category getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(Category value) { this.category = value; }

    @JsonProperty("shouldLazyLoad")
    public Boolean getShouldLazyLoad() { return shouldLazyLoad; }
    @JsonProperty("shouldLazyLoad")
    public void setShouldLazyLoad(Boolean value) { this.shouldLazyLoad = value; }

    @JsonProperty("productLocationDisplayValue")
    public String getProductLocationDisplayValue() { return productLocationDisplayValue; }
    @JsonProperty("productLocationDisplayValue")
    public void setProductLocationDisplayValue(String value) { this.productLocationDisplayValue = value; }

    @JsonProperty("fulfillmentSpeed")
    public FulfillmentSpeed[] getFulfillmentSpeed() { return fulfillmentSpeed; }
    @JsonProperty("fulfillmentSpeed")
    public void setFulfillmentSpeed(FulfillmentSpeed[] value) { this.fulfillmentSpeed = value; }

    @JsonProperty("displayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("displayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("hasVideo")
    public Boolean getHasVideo() { return hasVideo; }
    @JsonProperty("hasVideo")
    public void setHasVideo(Boolean value) { this.hasVideo = value; }

    @JsonProperty("adUuid")
    public UUID getAdUUID() { return adUUID; }
    @JsonProperty("adUuid")
    public void setAdUUID(UUID value) { this.adUUID = value; }

    @JsonProperty("lazy")
    public String getLazy() { return lazy; }
    @JsonProperty("lazy")
    public void setLazy(String value) { this.lazy = value; }

    @JsonProperty("moduleInfo")
    public String getModuleInfo() { return moduleInfo; }
    @JsonProperty("moduleInfo")
    public void setModuleInfo(String value) { this.moduleInfo = value; }

    @JsonProperty("moduleLocation")
    public String getModuleLocation() { return moduleLocation; }
    @JsonProperty("moduleLocation")
    public void setModuleLocation(String value) { this.moduleLocation = value; }
}
