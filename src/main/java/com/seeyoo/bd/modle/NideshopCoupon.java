package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_coupon", schema = "nideshop", catalog = "")
public class NideshopCoupon {
    private int id;
    private String name;
    private BigDecimal typeMoney;
    private short sendType;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private int sendStartDate;
    private int sendEndDate;
    private int useStartDate;
    private int useEndDate;
    private BigDecimal minGoodsAmount;

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
    @Column(name = "type_money", nullable = false, precision = 2)
    public BigDecimal getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(BigDecimal typeMoney) {
        this.typeMoney = typeMoney;
    }

    @Basic
    @Column(name = "send_type", nullable = false)
    public short getSendType() {
        return sendType;
    }

    public void setSendType(short sendType) {
        this.sendType = sendType;
    }

    @Basic
    @Column(name = "min_amount", nullable = false, precision = 2)
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    @Basic
    @Column(name = "max_amount", nullable = false, precision = 2)
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Basic
    @Column(name = "send_start_date", nullable = false)
    public int getSendStartDate() {
        return sendStartDate;
    }

    public void setSendStartDate(int sendStartDate) {
        this.sendStartDate = sendStartDate;
    }

    @Basic
    @Column(name = "send_end_date", nullable = false)
    public int getSendEndDate() {
        return sendEndDate;
    }

    public void setSendEndDate(int sendEndDate) {
        this.sendEndDate = sendEndDate;
    }

    @Basic
    @Column(name = "use_start_date", nullable = false)
    public int getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(int useStartDate) {
        this.useStartDate = useStartDate;
    }

    @Basic
    @Column(name = "use_end_date", nullable = false)
    public int getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(int useEndDate) {
        this.useEndDate = useEndDate;
    }

    @Basic
    @Column(name = "min_goods_amount", nullable = false, precision = 2)
    public BigDecimal getMinGoodsAmount() {
        return minGoodsAmount;
    }

    public void setMinGoodsAmount(BigDecimal minGoodsAmount) {
        this.minGoodsAmount = minGoodsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopCoupon that = (NideshopCoupon) o;
        return id == that.id &&
                sendType == that.sendType &&
                sendStartDate == that.sendStartDate &&
                sendEndDate == that.sendEndDate &&
                useStartDate == that.useStartDate &&
                useEndDate == that.useEndDate &&
                Objects.equals(name, that.name) &&
                Objects.equals(typeMoney, that.typeMoney) &&
                Objects.equals(minAmount, that.minAmount) &&
                Objects.equals(maxAmount, that.maxAmount) &&
                Objects.equals(minGoodsAmount, that.minGoodsAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, typeMoney, sendType, minAmount, maxAmount, sendStartDate, sendEndDate, useStartDate, useEndDate, minGoodsAmount);
    }
}
