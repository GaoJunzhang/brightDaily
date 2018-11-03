package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_related_goods", schema = "nideshop", catalog = "")
public class NideshopRelatedGoods {
    private int id;
    private int goodsId;
    private int relatedGoodsId;

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
    @Column(name = "related_goods_id", nullable = false)
    public int getRelatedGoodsId() {
        return relatedGoodsId;
    }

    public void setRelatedGoodsId(int relatedGoodsId) {
        this.relatedGoodsId = relatedGoodsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopRelatedGoods that = (NideshopRelatedGoods) o;
        return id == that.id &&
                goodsId == that.goodsId &&
                relatedGoodsId == that.relatedGoodsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, relatedGoodsId);
    }
}
