package com.example.gapsi.eComItemJavaquicktype;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemElement {
    private ItemTypename typename;
    private AvailabilityStatusDisplayValue availabilityStatusDisplayValue;
    private String externalInfoURL;
    private String canonicalURL;
    private Boolean canAddToCart;
    private Boolean showOptions;
    private String description;
    private String flag;
    private Object[] fulfillmentBadges;
    private FulfillmentType fulfillmentType;
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
    private String shortDescription;
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
    public String getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(String value) { this.flag = value; }

    @JsonProperty("fulfillmentBadges")
    public Object[] getFulfillmentBadges() { return fulfillmentBadges; }
    @JsonProperty("fulfillmentBadges")
    public void setFulfillmentBadges(Object[] value) { this.fulfillmentBadges = value; }

    @JsonProperty("fulfillmentType")
    public FulfillmentType getFulfillmentType() { return fulfillmentType; }
    @JsonProperty("fulfillmentType")
    public void setFulfillmentType(FulfillmentType value) { this.fulfillmentType = value; }

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
}
