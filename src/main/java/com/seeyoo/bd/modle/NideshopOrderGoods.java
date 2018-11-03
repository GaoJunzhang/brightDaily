package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_order_goods", schema = "nideshop", catalog = "")
public class NideshopOrderGoods {
    private int id;
    private int orderId;
    private int goodsId;
    private String goodsName;
    private String goodsSn;
    private int productId;
    private short number;
    private BigDecimal marketPrice;
    private BigDecimal retailPrice;
    private String goodsSpecifitionNameValue;
    private short isReal;
    private String goodsSpecifitionIds;
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
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "goods_id", nullable = false)
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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
    @Column(name = "number", nullable = false)
    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
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
    @Column(name = "goods_specifition_name_value", nullable = false, length = -1)
    public String getGoodsSpecifitionNameValue() {
        return goodsSpecifitionNameValue;
    }

    public void setGoodsSpecifitionNameValue(String goodsSpecifitionNameValue) {
        this.goodsSpecifitionNameValue = goodsSpecifitionNameValue;
    }

    @Basic
    @Column(name = "is_real", nullable = false)
    public short getIsReal() {
        return isReal;
    }

    public void setIsReal(short isReal) {
        this.isReal = isReal;
    }

    @Basic
    @Column(name = "goods_specifition_ids", nullable = false, length = 255)
    public String getGoodsSpecifitionIds() {
        return goodsSpecifitionIds;
    }

    public void setGoodsSpecifitionIds(String goodsSpecifitionIds) {
        this.goodsSpecifitionIds = goodsSpecifitionIds;
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
        NideshopOrderGoods that = (NideshopOrderGoods) o;
        return id == that.id &&
                orderId == that.orderId &&
                goodsId == that.goodsId &&
                productId == that.productId &&
                number == that.number &&
                isReal == that.isReal &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(marketPrice, that.marketPrice) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(goodsSpecifitionNameValue, that.goodsSpecifitionNameValue) &&
                Objects.equals(goodsSpecifitionIds, that.goodsSpecifitionIds) &&
                Objects.equals(listPicUrl, that.listPicUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, goodsId, goodsName, goodsSn, productId, number, marketPrice, retailPrice, goodsSpecifitionNameValue, isReal, goodsSpecifitionIds, listPicUrl);
    }
}
