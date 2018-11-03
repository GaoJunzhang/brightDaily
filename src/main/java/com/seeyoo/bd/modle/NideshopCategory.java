package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_category", schema = "nideshop", catalog = "")
public class NideshopCategory {
    private int id;
    private String name;
    private String keywords;
    private String frontDesc;
    private int parentId;
    private short sortOrder;
    private short showIndex;
    private short isShow;
    private String bannerUrl;
    private String iconUrl;
    private String imgUrl;
    private String wapBannerUrl;
    private String level;
    private int type;
    private String frontName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 90)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "front_desc", nullable = false, length = 255)
    public String getFrontDesc() {
        return frontDesc;
    }

    public void setFrontDesc(String frontDesc) {
        this.frontDesc = frontDesc;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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
    @Column(name = "show_index", nullable = false)
    public short getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(short showIndex) {
        this.showIndex = showIndex;
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
    @Column(name = "banner_url", nullable = false, length = 255)
    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    @Basic
    @Column(name = "icon_url", nullable = false, length = 255)
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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
    @Column(name = "wap_banner_url", nullable = false, length = 255)
    public String getWapBannerUrl() {
        return wapBannerUrl;
    }

    public void setWapBannerUrl(String wapBannerUrl) {
        this.wapBannerUrl = wapBannerUrl;
    }

    @Basic
    @Column(name = "level", nullable = false, length = 255)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "front_name", nullable = false, length = 255)
    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopCategory that = (NideshopCategory) o;
        return id == that.id &&
                parentId == that.parentId &&
                sortOrder == that.sortOrder &&
                showIndex == that.showIndex &&
                isShow == that.isShow &&
                type == that.type &&
                Objects.equals(name, that.name) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(frontDesc, that.frontDesc) &&
                Objects.equals(bannerUrl, that.bannerUrl) &&
                Objects.equals(iconUrl, that.iconUrl) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(wapBannerUrl, that.wapBannerUrl) &&
                Objects.equals(level, that.level) &&
                Objects.equals(frontName, that.frontName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, keywords, frontDesc, parentId, sortOrder, showIndex, isShow, bannerUrl, iconUrl, imgUrl, wapBannerUrl, level, type, frontName);
    }
}
