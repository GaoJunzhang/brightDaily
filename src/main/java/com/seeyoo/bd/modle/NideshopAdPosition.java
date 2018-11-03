package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_ad_position", schema = "nideshop", catalog = "")
public class NideshopAdPosition {
    private int id;
    private String name;
    private short width;
    private short height;
    private String desc;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "width", nullable = false)
    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = false)
    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    @Basic
    @Column(name = "desc", nullable = false, length = 255)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopAdPosition that = (NideshopAdPosition) o;
        return id == that.id &&
                width == that.width &&
                height == that.height &&
                Objects.equals(name, that.name) &&
                Objects.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, width, height, desc);
    }
}
