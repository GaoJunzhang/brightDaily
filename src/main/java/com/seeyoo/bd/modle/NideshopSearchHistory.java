package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_search_history", schema = "nideshop", catalog = "")
public class NideshopSearchHistory {
    private int id;
    private String keyword;
    private String from;
    private int addTime;
    private String userId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "keyword", nullable = false, length = 50)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "from", nullable = false, length = 45)
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
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
    @Column(name = "user_id", nullable = true, length = 45)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopSearchHistory that = (NideshopSearchHistory) o;
        return id == that.id &&
                addTime == that.addTime &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(from, that.from) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyword, from, addTime, userId);
    }
}
