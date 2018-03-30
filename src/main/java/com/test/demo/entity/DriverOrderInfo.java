package com.test.demo.entity;

import java.util.Date;

public class DriverOrderInfo {
    private Integer id;

    private Integer userId;

    private Integer tripId;

    private Integer orderPrice;

    private Integer orderStatus;

    private Integer passengersTripId;

    private String passengersEndPlace;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPassengersTripId() {
        return passengersTripId;
    }

    public void setPassengersTripId(Integer passengersTripId) {
        this.passengersTripId = passengersTripId;
    }

    public String getPassengersEndPlace() {
        return passengersEndPlace;
    }

    public void setPassengersEndPlace(String passengersEndPlace) {
        this.passengersEndPlace = passengersEndPlace == null ? null : passengersEndPlace.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}