package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_region", schema = "nideshop", catalog = "")
public class NideshopRegion {
    private short id;
    private short parentId;
    private String name;
    private short type;
    private short agencyId;

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public short getParentId() {
        return parentId;
    }

    public void setParentId(short parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "agency_id", nullable = false)
    public short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(short agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopRegion that = (NideshopRegion) o;
        return id == that.id &&
                parentId == that.parentId &&
                type == that.type &&
                agencyId == that.agencyId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name, type, agencyId);
    }
}
