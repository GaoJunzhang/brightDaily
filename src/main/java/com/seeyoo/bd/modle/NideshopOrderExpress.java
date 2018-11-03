package com.seeyoo.bd.modle;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nideshop_order_express", schema = "nideshop", catalog = "")
public class NideshopOrderExpress {
    private int id;
    private int orderId;
    private int shipperId;
    private String shipperName;
    private String shipperCode;
    private String logisticCode;
    private String traces;
    private short isFinish;
    private Integer requestCount;
    private Integer requestTime;
    private int addTime;
    private int updateTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "shipper_id", nullable = false)
    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    @Basic
    @Column(name = "shipper_name", nullable = false, length = 120)
    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    @Basic
    @Column(name = "shipper_code", nullable = false, length = 60)
    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode;
    }

    @Basic
    @Column(name = "logistic_code", nullable = false, length = 20)
    public String getLogisticCode() {
        return logisticCode;
    }

    public void setLogisticCode(String logisticCode) {
        this.logisticCode = logisticCode;
    }

    @Basic
    @Column(name = "traces", nullable = false, length = 2000)
    public String getTraces() {
        return traces;
    }

    public void setTraces(String traces) {
        this.traces = traces;
    }

    @Basic
    @Column(name = "is_finish", nullable = false)
    public short getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(short isFinish) {
        this.isFinish = isFinish;
    }

    @Basic
    @Column(name = "request_count", nullable = true)
    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    @Basic
    @Column(name = "request_time", nullable = true)
    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopOrderExpress that = (NideshopOrderExpress) o;
        return id == that.id &&
                orderId == that.orderId &&
                shipperId == that.shipperId &&
                isFinish == that.isFinish &&
                addTime == that.addTime &&
                updateTime == that.updateTime &&
                Objects.equals(shipperName, that.shipperName) &&
                Objects.equals(shipperCode, that.shipperCode) &&
                Objects.equals(logisticCode, that.logisticCode) &&
                Objects.equals(traces, that.traces) &&
                Objects.equals(requestCount, that.requestCount) &&
                Objects.equals(requestTime, that.requestTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, shipperId, shipperName, shipperCode, logisticCode, traces, isFinish, requestCount, requestTime, addTime, updateTime);
    }
}
