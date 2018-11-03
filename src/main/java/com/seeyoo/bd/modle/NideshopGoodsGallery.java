package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_goods_gallery", schema = "nideshop", catalog = "")
public class NideshopGoodsGallery {
    private int id;
    private int goodsId;
    private String imgUrl;
    private String imgDesc;
    private int sortOrder;

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
    @Column(name = "img_url", nullable = false, length = 255)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "img_desc", nullable = false, length = 255)
    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    @Basic
    @Column(name = "sort_order", nullable = false)
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopGoodsGallery that = (NideshopGoodsGallery) o;
        return id == that.id &&
                goodsId == that.goodsId &&
                sortOrder == that.sortOrder &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(imgDesc, that.imgDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsId, imgUrl, imgDesc, sortOrder);
    }
}
