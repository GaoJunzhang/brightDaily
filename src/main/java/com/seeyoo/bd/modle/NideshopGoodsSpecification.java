package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_goods_specification", schema = "nideshop", catalog = "")
public class NideshopGoodsSpecification {
    private int id;
    private int goodsId;
    private int specificationId;
    private String value;
    private String picUrl;

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
    @Column(name = "specification_id", nullable = false)
    public int getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(int specificationId) {
        this.specificationId = specificationId;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 50)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "pic_url", nullable = false, length = 255)
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopGoodsSpecification that = (NideshopGoodsSpecification) o;
        return id == that.id &&
                goodsId == that.goodsId &&
                specificationId == that.specificationId &&
                Objects.equals(value, that.value) &&
                Objects.equals(picUrl, that.picUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, specificationId, value, picUrl);
    }
}
