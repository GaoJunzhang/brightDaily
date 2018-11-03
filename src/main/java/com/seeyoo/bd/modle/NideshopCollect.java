package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_collect", schema = "nideshop", catalog = "")
public class NideshopCollect {
    private int id;
    private long userId;
    private int valueId;
    private int addTime;
    private short isAttention;
    private int typeId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "value_id", nullable = false)
    public int getValueId() {
        return valueId;
    }

    public void setValueId(int valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "add_time", nullable = false)
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "is_attention", nullable = false)
    public short getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(short isAttention) {
        this.isAttention = isAttention;
    }

    @Basic
    @Column(name = "type_id", nullable = false)
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopCollect that = (NideshopCollect) o;
        return id == that.id &&
                userId == that.userId &&
                valueId == that.valueId &&
                addTime == that.addTime &&
                isAttention == that.isAttention &&
                typeId == that.typeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, valueId, addTime, isAttention, typeId);
    }
}
