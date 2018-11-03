package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_comment_picture", schema = "nideshop", catalog = "")
public class NideshopCommentPicture {
    private int id;
    private int commentId;
    private String picUrl;
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
    @Column(name = "comment_id", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
        NideshopCommentPicture that = (NideshopCommentPicture) o;
        return id == that.id &&
                commentId == that.commentId &&
                sortOrder == that.sortOrder &&
                Objects.equals(picUrl, that.picUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentId, picUrl, sortOrder);
    }
}
