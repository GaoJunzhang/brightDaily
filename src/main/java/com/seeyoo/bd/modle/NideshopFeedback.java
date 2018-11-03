package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_feedback", schema = "nideshop", catalog = "")
public class NideshopFeedback {
    private int msgId;
    private int parentId;
    private long userId;
    private String userName;
    private String userEmail;
    private String msgTitle;
    private short msgType;
    private short msgStatus;
    private String msgContent;
    private int msgTime;
    private String messageImg;
    private int orderId;
    private short msgArea;

    @Id
    @Column(name = "msg_id", nullable = false)
    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
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
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 60)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_email", nullable = false, length = 60)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "msg_title", nullable = false, length = 200)
    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    @Basic
    @Column(name = "msg_type", nullable = false)
    public short getMsgType() {
        return msgType;
    }

    public void setMsgType(short msgType) {
        this.msgType = msgType;
    }

    @Basic
    @Column(name = "msg_status", nullable = false)
    public short getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(short msgStatus) {
        this.msgStatus = msgStatus;
    }

    @Basic
    @Column(name = "msg_content", nullable = false, length = -1)
    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Basic
    @Column(name = "msg_time", nullable = false)
    public int getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(int msgTime) {
        this.msgTime = msgTime;
    }

    @Basic
    @Column(name = "message_img", nullable = false, length = 255)
    public String getMessageImg() {
        return messageImg;
    }

    public void setMessageImg(String messageImg) {
        this.messageImg = messageImg;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "msg_area", nullable = false)
    public short getMsgArea() {
        return msgArea;
    }

    public void setMsgArea(short msgArea) {
        this.msgArea = msgArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopFeedback that = (NideshopFeedback) o;
        return msgId == that.msgId &&
                parentId == that.parentId &&
                userId == that.userId &&
                msgType == that.msgType &&
                msgStatus == that.msgStatus &&
                msgTime == that.msgTime &&
                orderId == that.orderId &&
                msgArea == that.msgArea &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(msgTitle, that.msgTitle) &&
                Objects.equals(msgContent, that.msgContent) &&
                Objects.equals(messageImg, that.messageImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId, parentId, userId, userName, userEmail, msgTitle, msgType, msgStatus, msgContent, msgTime, messageImg, orderId, msgArea);
    }
}
