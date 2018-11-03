package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_brand", schema = "nideshop", catalog = "")
public class NideshopBrand {
    private int id;
    private String name;
    private String listPicUrl;
    private String simpleDesc;
    private String picUrl;
    private short sortOrder;
    private short isShow;
    private BigDecimal floorPrice;
    private String appListPicUrl;
    private short isNew;
    private String newPicUrl;
    private short newSortOrder;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "simple_desc", nullable = false, length = 255)
    public String getSimpleDesc() {
        return simpleDesc;
    }

    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }

    @Basic
    @Column(name = "pic_url", nullable = false, length = 255)
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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
    @Column(name = "is_show", nullable = false)
    public short getIsShow() {
        return isShow;
    }

    public void setIsShow(short isShow) {
        this.isShow = isShow;
    }

    @Basic
    @Column(name = "floor_price", nullable = false, precision = 2)
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    @Basic
    @Column(name = "app_list_pic_url", nullable = false, length = 255)
    public String getAppListPicUrl() {
        return appListPicUrl;
    }

    public void setAppListPicUrl(String appListPicUrl) {
        this.appListPicUrl = appListPicUrl;
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
    @Column(name = "new_pic_url", nullable = false, length = 255)
    public String getNewPicUrl() {
        return newPicUrl;
    }

    public void setNewPicUrl(String newPicUrl) {
        this.newPicUrl = newPicUrl;
    }

    @Basic
    @Column(name = "new_sort_order", nullable = false)
    public short getNewSortOrder() {
        return newSortOrder;
    }

    public void setNewSortOrder(short newSortOrder) {
        this.newSortOrder = newSortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopBrand that = (NideshopBrand) o;
        return id == that.id &&
                sortOrder == that.sortOrder &&
                isShow == that.isShow &&
                isNew == that.isNew &&
                newSortOrder == that.newSortOrder &&
                Objects.equals(name, that.name) &&
                Objects.equals(listPicUrl, that.listPicUrl) &&
                Objects.equals(simpleDesc, that.simpleDesc) &&
                Objects.equals(picUrl, that.picUrl) &&
                Objects.equals(floorPrice, that.floorPrice) &&
                Objects.equals(appListPicUrl, that.appListPicUrl) &&
                Objects.equals(newPicUrl, that.newPicUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, listPicUrl, simpleDesc, picUrl, sortOrder, isShow, floorPrice, appListPicUrl, isNew, newPicUrl, newSortOrder);
    }
}
