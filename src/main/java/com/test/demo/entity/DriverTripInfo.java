package com.test.demo.entity;

import java.util.Date;

public class DriverTripInfo {
    private Integer id;

    private Integer routeId;

    private Date tripDate;

    private Date tripTime;

    private Integer seatCount;

    private String wayTagsId;

    private Integer tripStatus;

    private Integer tripPrice;

    private Integer tripDistance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    public Date getTripTime() {
        return tripTime;
    }

    public void setTripTime(Date tripTime) {
        this.tripTime = tripTime;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getWayTagsId() {
        return wayTagsId;
    }

    public void setWayTagsId(String wayTagsId) {
        this.wayTagsId = wayTagsId == null ? null : wayTagsId.trim();
    }

    public Integer getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(Integer tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Integer getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(Integer tripPrice) {
        this.tripPrice = tripPrice;
    }

    public Integer getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(Integer tripDistance) {
        this.tripDistance = tripDistance;
    }
}