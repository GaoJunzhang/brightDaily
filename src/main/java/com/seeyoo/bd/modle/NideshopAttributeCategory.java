package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_attribute_category", schema = "nideshop", catalog = "")
public class NideshopAttributeCategory {
    private int id;
    private String name;
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
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        NideshopAttributeCategory that = (NideshopAttributeCategory) o;
        return id == that.id &&
                enabled == that.enabled &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, enabled);
    }
}
