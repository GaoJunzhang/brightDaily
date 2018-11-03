package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_user", schema = "nideshop", catalog = "")
public class NideshopUser {
    private long id;
    private String username;
    private String password;
    private short gender;
    private int birthday;
    private int registerTime;
    private int lastLoginTime;
    private String lastLoginIp;
    private short userLevelId;
    private String nickname;
    private String mobile;
    private String registerIp;
    private String avatar;
    private String weixinOpenid;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 60)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "gender", nullable = false)
    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday", nullable = false)
    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "register_time", nullable = false)
    public int getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(int registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "last_login_time", nullable = false)
    public int getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(int lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "last_login_ip", nullable = false, length = 15)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "user_level_id", nullable = false)
    public short getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(short userLevelId) {
        this.userLevelId = userLevelId;
    }

    @Basic
    @Column(name = "nickname", nullable = false, length = 60)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "mobile", nullable = false, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "register_ip", nullable = false, length = 45)
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    @Basic
    @Column(name = "avatar", nullable = false, length = 255)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "weixin_openid", nullable = false, length = 50)
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopUser that = (NideshopUser) o;
        return id == that.id &&
                gender == that.gender &&
                birthday == that.birthday &&
                registerTime == that.registerTime &&
                lastLoginTime == that.lastLoginTime &&
                userLevelId == that.userLevelId &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(lastLoginIp, that.lastLoginIp) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(registerIp, that.registerIp) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(weixinOpenid, that.weixinOpenid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, gender, birthday, registerTime, lastLoginTime, lastLoginIp, userLevelId, nickname, mobile, registerIp, avatar, weixinOpenid);
    }
}
