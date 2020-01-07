package com.cn.ssm.domain;

import java.util.Date;

public class Count {
    private String id;

    private String card_id;

    private int SE_Num;

    private Date day;

    private String startDay;

    private String endDay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getSE_Num() {
        return SE_Num;
    }

    public void setSE_Num(int SE_Num) {
        this.SE_Num = SE_Num;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
