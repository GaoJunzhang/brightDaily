package com.seeyoo.bd.modle;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class NideshopKeywordsPK implements Serializable {
    private String keyword;
    private int id;

    @Column(name = "keyword", nullable = false, length = 90)
    @Id
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopKeywordsPK that = (NideshopKeywordsPK) o;
        return id == that.id &&
                Objects.equals(keyword, that.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, id);
    }
}
