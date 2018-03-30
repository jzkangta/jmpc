package com.test.demo.entity;

import java.util.Date;

public class PlaceTagInfo {
    private Integer id;

    private Integer cityId;

    private Integer areaId;

    private String tagName;

    private Integer tagStatus;

    private Date createTime;

    private String tagLongitude;

    private String tagLatitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(Integer tagStatus) {
        this.tagStatus = tagStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTagLongitude() {
        return tagLongitude;
    }

    public void setTagLongitude(String tagLongitude) {
        this.tagLongitude = tagLongitude == null ? null : tagLongitude.trim();
    }

    public String getTagLatitude() {
        return tagLatitude;
    }

    public void setTagLatitude(String tagLatitude) {
        this.tagLatitude = tagLatitude == null ? null : tagLatitude.trim();
    }
}