package com.test.demo.entity;

import java.util.Date;

public class UserRouteInfo {
    private Integer id;

    private Integer userId;

    private String startPlace;

    private String startLongitude;

    private String startLatitude;

    private Date startTime;

    private String endPlace;

    private String endLongitude;

    private String endLatitude;

    private Integer routeStatus;

    private Integer routeType;

    private String startPlaceDesc;

    private String endPalsceDesc;

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

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace == null ? null : startPlace.trim();
    }

    public String getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(String startLongitude) {
        this.startLongitude = startLongitude == null ? null : startLongitude.trim();
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude == null ? null : startLatitude.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace == null ? null : endPlace.trim();
    }

    public String getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude == null ? null : endLongitude.trim();
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude == null ? null : endLatitude.trim();
    }

    public Integer getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(Integer routeStatus) {
        this.routeStatus = routeStatus;
    }

    public Integer getRouteType() {
        return routeType;
    }

    public void setRouteType(Integer routeType) {
        this.routeType = routeType;
    }

    public String getStartPlaceDesc() {
        return startPlaceDesc;
    }

    public void setStartPlaceDesc(String startPlaceDesc) {
        this.startPlaceDesc = startPlaceDesc == null ? null : startPlaceDesc.trim();
    }

    public String getEndPalsceDesc() {
        return endPalsceDesc;
    }

    public void setEndPalsceDesc(String endPalsceDesc) {
        this.endPalsceDesc = endPalsceDesc == null ? null : endPalsceDesc.trim();
    }
}