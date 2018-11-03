package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_attribute", schema = "nideshop", catalog = "")
public class NideshopAttribute {
    private int id;
    private int attributeCategoryId;
    private String name;
    private short inputType;
    private String values;
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
    @Column(name = "attribute_category_id", nullable = false)
    public int getAttributeCategoryId() {
        return attributeCategoryId;
    }

    public void setAttributeCategoryId(int attributeCategoryId) {
        this.attributeCategoryId = attributeCategoryId;
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
    @Column(name = "input_type", nullable = false)
    public short getInputType() {
        return inputType;
    }

    public void setInputType(short inputType) {
        this.inputType = inputType;
    }

    @Basic
    @Column(name = "values", nullable = false, length = -1)
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
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
        NideshopAttribute that = (NideshopAttribute) o;
        return id == that.id &&
                attributeCategoryId == that.attributeCategoryId &&
                inputType == that.inputType &&
                sortOrder == that.sortOrder &&
                Objects.equals(name, that.name) &&
                Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attributeCategoryId, name, inputType, values, sortOrder);
    }
}
