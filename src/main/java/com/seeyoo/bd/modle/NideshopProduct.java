package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_product", schema = "nideshop", catalog = "")
public class NideshopProduct {
    private int id;
    private int goodsId;
    private String goodsSpecificationIds;
    private String goodsSn;
    private int goodsNumber;
    private BigDecimal retailPrice;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "goods_specification_ids", nullable = false, length = 50)
    public String getGoodsSpecificationIds() {
        return goodsSpecificationIds;
    }

    public void setGoodsSpecificationIds(String goodsSpecificationIds) {
        this.goodsSpecificationIds = goodsSpecificationIds;
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
    @Column(name = "goods_number", nullable = false)
    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "retail_price", nullable = false, precision = 2)
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopProduct that = (NideshopProduct) o;
        return id == that.id &&
                goodsId == that.goodsId &&
                goodsNumber == that.goodsNumber &&
                Objects.equals(goodsSpecificationIds, that.goodsSpecificationIds) &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, goodsSpecificationIds, goodsSn, goodsNumber, retailPrice);
    }
}
