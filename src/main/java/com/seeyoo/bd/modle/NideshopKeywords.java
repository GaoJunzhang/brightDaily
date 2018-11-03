package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_keywords", schema = "nideshop", catalog = "")
@IdClass(NideshopKeywordsPK.class)
public class NideshopKeywords {
    private String keyword;
    private short isHot;
    private short isDefault;
    private short isShow;
    private int sortOrder;
    private String schemeUrl;
    private int id;
    private int type;

    @Id
    @Column(name = "keyword", nullable = false, length = 90)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "is_hot", nullable = false)
    public short getIsHot() {
        return isHot;
    }

    public void setIsHot(short isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "is_default", nullable = false)
    public short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(short isDefault) {
        this.isDefault = isDefault;
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
    @Column(name = "sort_order", nullable = false)
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "scheme _url", nullable = false, length = 255)
    public String getSchemeUrl() {
        return schemeUrl;
    }

    public void setSchemeUrl(String schemeUrl) {
        this.schemeUrl = schemeUrl;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopKeywords that = (NideshopKeywords) o;
        return isHot == that.isHot &&
                isDefault == that.isDefault &&
                isShow == that.isShow &&
                sortOrder == that.sortOrder &&
                id == that.id &&
                type == that.type &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(schemeUrl, that.schemeUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, isHot, isDefault, isShow, sortOrder, schemeUrl, id, type);
    }
}
