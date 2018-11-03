package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_goods", schema = "nideshop", catalog = "")
public class NideshopGoods {
    private int id;
    private int categoryId;
    private String goodsSn;
    private String name;
    private int brandId;
    private int goodsNumber;
    private String keywords;
    private String goodsBrief;
    private String goodsDesc;
    private short isOnSale;
    private int addTime;
    private short sortOrder;
    private short isDelete;
    private int attributeCategory;
    private BigDecimal counterPrice;
    private BigDecimal extraPrice;
    private short isNew;
    private String goodsUnit;
    private String primaryPicUrl;
    private String listPicUrl;
    private BigDecimal retailPrice;
    private int sellVolume;
    private int primaryProductId;
    private BigDecimal unitPrice;
    private String promotionDesc;
    private String promotionTag;
    private BigDecimal appExclusivePrice;
    private short isAppExclusive;
    private short isLimited;
    private short isHot;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "goods_sn", nullable = false, length = 60)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "brand_id", nullable = false)
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "goods_number", nullable = false)
    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "keywords", nullable = false, length = 255)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "goods_brief", nullable = false, length = 255)
    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    @Basic
    @Column(name = "goods_desc", nullable = true, length = -1)
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Basic
    @Column(name = "is_on_sale", nullable = false)
    public short getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(short isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Basic
    @Column(name = "add_time", nullable = false)
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "sort_order", nullable = false)
    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(short isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "attribute_category", nullable = false)
    public int getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(int attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    @Basic
    @Column(name = "counter_price", nullable = false, precision = 2)
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    @Basic
    @Column(name = "extra_price", nullable = false, precision = 2)
    public BigDecimal getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(BigDecimal extraPrice) {
        this.extraPrice = extraPrice;
    }

    @Basic
    @Column(name = "is_new", nullable = false)
    public short getIsNew() {
        return isNew;
    }

    public void setIsNew(short isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "goods_unit", nullable = false, length = 45)
    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    @Basic
    @Column(name = "primary_pic_url", nullable = false, length = 255)
    public String getPrimaryPicUrl() {
        return primaryPicUrl;
    }

    public void setPrimaryPicUrl(String primaryPicUrl) {
        this.primaryPicUrl = primaryPicUrl;
    }

    @Basic
    @Column(name = "list_pic_url", nullable = false, length = 255)
    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    @Basic
    @Column(name = "retail_price", nullable = false, precision = 2)
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "sell_volume", nullable = false)
    public int getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(int sellVolume) {
        this.sellVolume = sellVolume;
    }

    @Basic
    @Column(name = "primary_product_id", nullable = false)
    public int getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(int primaryProductId) {
        this.primaryProductId = primaryProductId;
    }

    @Basic
    @Column(name = "unit_price", nullable = false, precision = 2)
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "promotion_desc", nullable = false, length = 255)
    public String getPromotionDesc() {
        return promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    @Basic
    @Column(name = "promotion_tag", nullable = false, length = 45)
    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    @Basic
    @Column(name = "app_exclusive_price", nullable = false, precision = 2)
    public BigDecimal getAppExclusivePrice() {
        return appExclusivePrice;
    }

    public void setAppExclusivePrice(BigDecimal appExclusivePrice) {
        this.appExclusivePrice = appExclusivePrice;
    }

    @Basic
    @Column(name = "is_app_exclusive", nullable = false)
    public short getIsAppExclusive() {
        return isAppExclusive;
    }

    public void setIsAppExclusive(short isAppExclusive) {
        this.isAppExclusive = isAppExclusive;
    }

    @Basic
    @Column(name = "is_limited", nullable = false)
    public short getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(short isLimited) {
        this.isLimited = isLimited;
    }

    @Basic
    @Column(name = "is_hot", nullable = false)
    public short getIsHot() {
        return isHot;
    }

    public void setIsHot(short isHot) {
        this.isHot = isHot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopGoods that = (NideshopGoods) o;
        return id == that.id &&
                categoryId == that.categoryId &&
                brandId == that.brandId &&
                goodsNumber == that.goodsNumber &&
                isOnSale == that.isOnSale &&
                addTime == that.addTime &&
                sortOrder == that.sortOrder &&
                isDelete == that.isDelete &&
                attributeCategory == that.attributeCategory &&
                isNew == that.isNew &&
                sellVolume == that.sellVolume &&
                primaryProductId == that.primaryProductId &&
                isAppExclusive == that.isAppExclusive &&
                isLimited == that.isLimited &&
                isHot == that.isHot &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(name, that.name) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(goodsBrief, that.goodsBrief) &&
                Objects.equals(goodsDesc, that.goodsDesc) &&
                Objects.equals(counterPrice, that.counterPrice) &&
                Objects.equals(extraPrice, that.extraPrice) &&
                Objects.equals(goodsUnit, that.goodsUnit) &&
                Objects.equals(primaryPicUrl, that.primaryPicUrl) &&
                Objects.equals(listPicUrl, that.listPicUrl) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(promotionDesc, that.promotionDesc) &&
                Objects.equals(promotionTag, that.promotionTag) &&
                Objects.equals(appExclusivePrice, that.appExclusivePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, goodsSn, name, brandId, goodsNumber, keywords, goodsBrief, goodsDesc, isOnSale, addTime, sortOrder, isDelete, attributeCategory, counterPrice, extraPrice, isNew, goodsUnit, primaryPicUrl, listPicUrl, retailPrice, sellVolume, primaryProductId, unitPrice, promotionDesc, promotionTag, appExclusivePrice, isAppExclusive, isLimited, isHot);
    }
}
