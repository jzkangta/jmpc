package com.test.demo.entity;

import java.util.Date;

public class UserWalletInfo {
    private Integer id;

    private Integer userId;

    private Integer operDetail;

    private Integer operMoney;

    private Date operTime;

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

    public Integer getOperDetail() {
        return operDetail;
    }

    public void setOperDetail(Integer operDetail) {
        this.operDetail = operDetail;
    }

    public Integer getOperMoney() {
        return operMoney;
    }

    public void setOperMoney(Integer operMoney) {
        this.operMoney = operMoney;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }
}