package com.device.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

public class DevLog {
    private String devBasicNo;
    private String devBasicName;
    private String devBasicBelong;
    private String devBasicQRcode;
    private String devBasicLocation;
    private Integer devBasicAdminID;
    private Integer devBasicClassify;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date devLogTime;

    public String getDevBasicNo() {
        return devBasicNo;
    }

    public void setDevBasicNo(String devBasicNo) {
        this.devBasicNo = devBasicNo;
    }

    public String getDevBasicName() {
        return devBasicName;
    }

    public void setDevBasicName(String devBasicName) {
        this.devBasicName = devBasicName;
    }

    public String getDevBasicBelong() {
        return devBasicBelong;
    }

    public void setDevBasicBelong(String devBasicBelong) {
        this.devBasicBelong = devBasicBelong;
    }

    public String getDevBasicQRcode() {
        return devBasicQRcode;
    }

    public void setDevBasicQRcode(String devBasicQRcode) {
        this.devBasicQRcode = devBasicQRcode;
    }

    public String getDevBasicLocation() {
        return devBasicLocation;
    }

    public void setDevBasicLocation(String devBasicLocation) {
        this.devBasicLocation = devBasicLocation;
    }

    public Integer getDevBasicAdminID() {
        return devBasicAdminID;
    }

    public void setDevBasicAdminID(Integer devBasicAdminID) {
        this.devBasicAdminID = devBasicAdminID;
    }

    public Integer getDevBasicClassify() {
        return devBasicClassify;
    }

    public void setDevBasicClassify(Integer devBasicClassify) {
        this.devBasicClassify = devBasicClassify;
    }

    public Date getDevLogTime() {
        return devLogTime;
    }

    public void setDevLogTime(Date devLogTime) {
        this.devLogTime = devLogTime;
    }
}
