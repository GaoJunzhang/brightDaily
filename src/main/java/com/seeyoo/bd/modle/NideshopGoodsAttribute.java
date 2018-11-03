package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_goods_attribute", schema = "nideshop", catalog = "")
public class NideshopGoodsAttribute {
    private int id;
    private int goodsId;
    private int attributeId;
    private String value;

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
    @Column(name = "attribute_id", nullable = false)
    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    @Basic
    @Column(name = "value", nullable = false, length = -1)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopGoodsAttribute that = (NideshopGoodsAttribute) o;
        return id == that.id &&
                goodsId == that.goodsId &&
                attributeId == that.attributeId &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, attributeId, value);
    }
}
