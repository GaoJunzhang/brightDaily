package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_user_coupon", schema = "nideshop", catalog = "")
public class NideshopUserCoupon {
    private int id;
    private int couponId;
    private String couponNumber;
    private int userId;
    private int usedTime;
    private int orderId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "coupon_id", nullable = false)
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "coupon_number", nullable = false, length = 20)
    public String getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
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
    @Column(name = "used_time", nullable = false)
    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopUserCoupon that = (NideshopUserCoupon) o;
        return id == that.id &&
                couponId == that.couponId &&
                userId == that.userId &&
                usedTime == that.usedTime &&
                orderId == that.orderId &&
                Objects.equals(couponNumber, that.couponNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, couponNumber, userId, usedTime, orderId);
    }
}
