package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_comment", schema = "nideshop", catalog = "")
public class NideshopComment {
    private int id;
    private short typeId;
    private int valueId;
    private String content;
    private long addTime;
    private short status;
    private int userId;
    private String newContent;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_id", nullable = false)
    public short getTypeId() {
        return typeId;
    }

    public void setTypeId(short typeId) {
        this.typeId = typeId;
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
    @Column(name = "content", nullable = false, length = 6550)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "add_time", nullable = false)
    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "new_content", nullable = false, length = 6550)
    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopComment that = (NideshopComment) o;
        return id == that.id &&
                typeId == that.typeId &&
                valueId == that.valueId &&
                addTime == that.addTime &&
                status == that.status &&
                userId == that.userId &&
                Objects.equals(content, that.content) &&
                Objects.equals(newContent, that.newContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeId, valueId, content, addTime, status, userId, newContent);
    }
}
