package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_ad", schema = "nideshop", catalog = "")
public class NideshopAd {
    private int id;
    private short adPositionId;
    private short mediaType;
    private String name;
    private String link;
    private String imageUrl;
    private String content;
    private int endTime;
    private short enabled;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ad_position_id", nullable = false)
    public short getAdPositionId() {
        return adPositionId;
    }

    public void setAdPositionId(short adPositionId) {
        this.adPositionId = adPositionId;
    }

    @Basic
    @Column(name = "media_type", nullable = false)
    public short getMediaType() {
        return mediaType;
    }

    public void setMediaType(short mediaType) {
        this.mediaType = mediaType;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "link", nullable = false, length = 255)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "image_url", nullable = false, length = -1)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "content", nullable = false, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "end_time", nullable = false)
    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopAd that = (NideshopAd) o;
        return id == that.id &&
                adPositionId == that.adPositionId &&
                mediaType == that.mediaType &&
                endTime == that.endTime &&
                enabled == that.enabled &&
                Objects.equals(name, that.name) &&
                Objects.equals(link, that.link) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adPositionId, mediaType, name, link, imageUrl, content, endTime, enabled);
    }
}
