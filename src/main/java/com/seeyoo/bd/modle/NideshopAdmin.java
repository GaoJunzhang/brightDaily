package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_admin", schema = "nideshop", catalog = "")
public class NideshopAdmin {
    private int id;
    private String username;
    private String password;
    private String passwordSalt;
    private String lastLoginIp;
    private int lastLoginTime;
    private int addTime;
    private int updateTime;
    private String avatar;
    private int adminRoleId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 10)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "password_salt", nullable = false, length = 255)
    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    @Basic
    @Column(name = "last_login_ip", nullable = false, length = 60)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
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
    @Column(name = "add_time", nullable = false)
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "admin_role_id", nullable = false)
    public int getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(int adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopAdmin that = (NideshopAdmin) o;
        return id == that.id &&
                lastLoginTime == that.lastLoginTime &&
                addTime == that.addTime &&
                updateTime == that.updateTime &&
                adminRoleId == that.adminRoleId &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(passwordSalt, that.passwordSalt) &&
                Objects.equals(lastLoginIp, that.lastLoginIp) &&
                Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, passwordSalt, lastLoginIp, lastLoginTime, addTime, updateTime, avatar, adminRoleId);
    }
}
