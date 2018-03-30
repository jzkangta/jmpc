package com.test.demo.entity;

import java.util.Date;

public class PassengersTripInfo {
    private Integer id;

    private Integer userId;

    private Integer routeId;

    private Date tripDate;

    private Date tripTime;

    private Integer personCount;

    private String placeTagsId;

    private Integer tripStatus;

    private Date createTime;

    private Integer tripDistance;

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

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public String getPlaceTagsId() {
        return placeTagsId;
    }

    public void setPlaceTagsId(String placeTagsId) {
        this.placeTagsId = placeTagsId == null ? null : placeTagsId.trim();
    }

    public Integer getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(Integer tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(Integer tripDistance) {
        this.tripDistance = tripDistance;
    }
}