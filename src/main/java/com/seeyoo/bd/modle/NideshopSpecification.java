package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_specification", schema = "nideshop", catalog = "")
public class NideshopSpecification {
    private int id;
    private String name;
    private short sortOrder;

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
    @Column(name = "sort_order", nullable = false)
    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopSpecification that = (NideshopSpecification) o;
        return id == that.id &&
                sortOrder == that.sortOrder &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sortOrder);
    }
}
