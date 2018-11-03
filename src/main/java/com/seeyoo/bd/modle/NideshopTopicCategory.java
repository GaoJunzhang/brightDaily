package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_topic_category", schema = "nideshop", catalog = "")
public class NideshopTopicCategory {
    private int id;
    private String title;
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
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        NideshopTopicCategory that = (NideshopTopicCategory) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(picUrl, that.picUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, picUrl);
    }
}
