package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_cart", schema = "nideshop", catalog = "")
public class NideshopCart {
    private int id;
    private long userId;
    private String sessionId;
    private long goodsId;
    private String goodsSn;
    private int productId;
    private String goodsName;
    private BigDecimal marketPrice;
    private BigDecimal retailPrice;
    private short number;
    private String goodsSpecifitionNameValue;
    private String goodsSpecifitionIds;
    private short checked;
    private String listPicUrl;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "session_id", nullable = false, length = 32)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "goods_id", nullable = false)
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
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
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "goods_name", nullable = false, length = 120)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "market_price", nullable = false, precision = 2)
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
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
    @Column(name = "number", nullable = false)
    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    @Basic
    @Column(name = "goods_specifition_name_value", nullable = false, length = -1)
    public String getGoodsSpecifitionNameValue() {
        return goodsSpecifitionNameValue;
    }

    public void setGoodsSpecifitionNameValue(String goodsSpecifitionNameValue) {
        this.goodsSpecifitionNameValue = goodsSpecifitionNameValue;
    }

    @Basic
    @Column(name = "goods_specifition_ids", nullable = false, length = 60)
    public String getGoodsSpecifitionIds() {
        return goodsSpecifitionIds;
    }

    public void setGoodsSpecifitionIds(String goodsSpecifitionIds) {
        this.goodsSpecifitionIds = goodsSpecifitionIds;
    }

    @Basic
    @Column(name = "checked", nullable = false)
    public short getChecked() {
        return checked;
    }

    public void setChecked(short checked) {
        this.checked = checked;
    }

    @Basic
    @Column(name = "list_pic_url", nullable = false, length = 255)
    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopCart that = (NideshopCart) o;
        return id == that.id &&
                userId == that.userId &&
                goodsId == that.goodsId &&
                productId == that.productId &&
                number == that.number &&
                checked == that.checked &&
                Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(marketPrice, that.marketPrice) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(goodsSpecifitionNameValue, that.goodsSpecifitionNameValue) &&
                Objects.equals(goodsSpecifitionIds, that.goodsSpecifitionIds) &&
                Objects.equals(listPicUrl, that.listPicUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, sessionId, goodsId, goodsSn, productId, goodsName, marketPrice, retailPrice, number, goodsSpecifitionNameValue, goodsSpecifitionIds, checked, listPicUrl);
    }
}
