package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_address", schema = "nideshop", catalog = "")
public class NideshopAddress {
    private int id;
    private String name;
    private long userId;
    private short countryId;
    private short provinceId;
    private short cityId;
    private short districtId;
    private String address;
    private String mobile;
    private short isDefault;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "country_id", nullable = false)
    public short getCountryId() {
        return countryId;
    }

    public void setCountryId(short countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "province_id", nullable = false)
    public short getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(short provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "city_id", nullable = false)
    public short getCityId() {
        return cityId;
    }

    public void setCityId(short cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "district_id", nullable = false)
    public short getDistrictId() {
        return districtId;
    }

    public void setDistrictId(short districtId) {
        this.districtId = districtId;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 120)
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
    @Column(name = "is_default", nullable = false)
    public short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(short isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopAddress that = (NideshopAddress) o;
        return id == that.id &&
                userId == that.userId &&
                countryId == that.countryId &&
                provinceId == that.provinceId &&
                cityId == that.cityId &&
                districtId == that.districtId &&
                isDefault == that.isDefault &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(mobile, that.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, userId, countryId, provinceId, cityId, districtId, address, mobile, isDefault);
    }
}
