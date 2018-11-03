package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "nideshop_order", schema = "nideshop", catalog = "")
public class NideshopOrder {
    private int id;
    private String orderSn;
    private long userId;
    private short orderStatus;
    private short shippingStatus;
    private short payStatus;
    private String consignee;
    private short country;
    private short province;
    private short city;
    private short district;
    private String address;
    private String mobile;
    private String postscript;
    private BigDecimal shippingFee;
    private String payName;
    private int payId;
    private BigDecimal actualPrice;
    private int integral;
    private BigDecimal integralMoney;
    private BigDecimal orderPrice;
    private BigDecimal goodsPrice;
    private int addTime;
    private int confirmTime;
    private int payTime;
    private int freightPrice;
    private int couponId;
    private int parentId;
    private BigDecimal couponPrice;
    private Enum callbackStatus;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_sn", nullable = false, length = 20)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    @Column(name = "order_status", nullable = false)
    public short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(short orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "shipping_status", nullable = false)
    public short getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(short shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    @Basic
    @Column(name = "pay_status", nullable = false)
    public short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(short payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "consignee", nullable = false, length = 60)
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "country", nullable = false)
    public short getCountry() {
        return country;
    }

    public void setCountry(short country) {
        this.country = country;
    }

    @Basic
    @Column(name = "province", nullable = false)
    public short getProvince() {
        return province;
    }

    public void setProvince(short province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city", nullable = false)
    public short getCity() {
        return city;
    }

    public void setCity(short city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district", nullable = false)
    public short getDistrict() {
        return district;
    }

    public void setDistrict(short district) {
        this.district = district;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "mobile", nullable = false, length = 60)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "postscript", nullable = false, length = 255)
    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    @Basic
    @Column(name = "shipping_fee", nullable = false, precision = 2)
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    @Basic
    @Column(name = "pay_name", nullable = false, length = 120)
    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    @Basic
    @Column(name = "pay_id", nullable = false)
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "actual_price", nullable = false, precision = 2)
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    @Basic
    @Column(name = "integral", nullable = false)
    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    @Basic
    @Column(name = "integral_money", nullable = false, precision = 2)
    public BigDecimal getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(BigDecimal integralMoney) {
        this.integralMoney = integralMoney;
    }

    @Basic
    @Column(name = "order_price", nullable = false, precision = 2)
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "goods_price", nullable = false, precision = 2)
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
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
    @Column(name = "confirm_time", nullable = false)
    public int getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(int confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Basic
    @Column(name = "pay_time", nullable = false)
    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "freight_price", nullable = false)
    public int getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(int freightPrice) {
        this.freightPrice = freightPrice;
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
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "coupon_price", nullable = false, precision = 2)
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    @Basic
    @Column(name = "callback_status", nullable = true)
    public Enum getCallbackStatus() {
        return callbackStatus;
    }

    public void setCallbackStatus(Enum callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopOrder that = (NideshopOrder) o;
        return id == that.id &&
                userId == that.userId &&
                orderStatus == that.orderStatus &&
                shippingStatus == that.shippingStatus &&
                payStatus == that.payStatus &&
                country == that.country &&
                province == that.province &&
                city == that.city &&
                district == that.district &&
                payId == that.payId &&
                integral == that.integral &&
                addTime == that.addTime &&
                confirmTime == that.confirmTime &&
                payTime == that.payTime &&
                freightPrice == that.freightPrice &&
                couponId == that.couponId &&
                parentId == that.parentId &&
                Objects.equals(orderSn, that.orderSn) &&
                Objects.equals(consignee, that.consignee) &&
                Objects.equals(address, that.address) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(postscript, that.postscript) &&
                Objects.equals(shippingFee, that.shippingFee) &&
                Objects.equals(payName, that.payName) &&
                Objects.equals(actualPrice, that.actualPrice) &&
                Objects.equals(integralMoney, that.integralMoney) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(goodsPrice, that.goodsPrice) &&
                Objects.equals(couponPrice, that.couponPrice) &&
                Objects.equals(callbackStatus, that.callbackStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderSn, userId, orderStatus, shippingStatus, payStatus, consignee, country, province, city, district, address, mobile, postscript, shippingFee, payName, payId, actualPrice, integral, integralMoney, orderPrice, goodsPrice, addTime, confirmTime, payTime, freightPrice, couponId, parentId, couponPrice, callbackStatus);
    }
}
