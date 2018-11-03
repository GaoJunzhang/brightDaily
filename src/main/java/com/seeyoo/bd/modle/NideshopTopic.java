package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_topic", schema = "nideshop", catalog = "")
public class NideshopTopic {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    private String title;
    private String content;
    private String avatar;
    private String itemPicUrl;
    private String subtitle;
    private int topicCategoryId;
    private BigDecimal priceInfo;
    private String readCount;
    private String scenePicUrl;
    private int topicTemplateId;
    private int topicTagId;
    private int sortOrder;
    private short isShow;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "avatar", nullable = false, length = 255)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "item_pic_url", nullable = false, length = 255)
    public String getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(String itemPicUrl) {
        this.itemPicUrl = itemPicUrl;
    }

    @Basic
    @Column(name = "subtitle", nullable = false, length = 255)
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @Column(name = "topic_category_id", nullable = false)
    public int getTopicCategoryId() {
        return topicCategoryId;
    }

    public void setTopicCategoryId(int topicCategoryId) {
        this.topicCategoryId = topicCategoryId;
    }

    @Basic
    @Column(name = "price_info", nullable = false, precision = 2)
    public BigDecimal getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(BigDecimal priceInfo) {
        this.priceInfo = priceInfo;
    }

    @Basic
    @Column(name = "read_count", nullable = false, length = 255)
    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "scene_pic_url", nullable = false, length = 255)
    public String getScenePicUrl() {
        return scenePicUrl;
    }

    public void setScenePicUrl(String scenePicUrl) {
        this.scenePicUrl = scenePicUrl;
    }

    @Basic
    @Column(name = "topic_template_id", nullable = false)
    public int getTopicTemplateId() {
        return topicTemplateId;
    }

    public void setTopicTemplateId(int topicTemplateId) {
        this.topicTemplateId = topicTemplateId;
    }

    @Basic
    @Column(name = "topic_tag_id", nullable = false)
    public int getTopicTagId() {
        return topicTagId;
    }

    public void setTopicTagId(int topicTagId) {
        this.topicTagId = topicTagId;
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
    @Column(name = "is_show", nullable = false)
    public short getIsShow() {
        return isShow;
    }

    public void setIsShow(short isShow) {
        this.isShow = isShow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopTopic that = (NideshopTopic) o;
        return id == that.id &&
                topicCategoryId == that.topicCategoryId &&
                topicTemplateId == that.topicTemplateId &&
                topicTagId == that.topicTagId &&
                sortOrder == that.sortOrder &&
                isShow == that.isShow &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(itemPicUrl, that.itemPicUrl) &&
                Objects.equals(subtitle, that.subtitle) &&
                Objects.equals(priceInfo, that.priceInfo) &&
                Objects.equals(readCount, that.readCount) &&
                Objects.equals(scenePicUrl, that.scenePicUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, avatar, itemPicUrl, subtitle, topicCategoryId, priceInfo, readCount, scenePicUrl, topicTemplateId, topicTagId, sortOrder, isShow);
    }
}
