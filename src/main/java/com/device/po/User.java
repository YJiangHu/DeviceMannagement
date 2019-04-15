package com.device.po;

public class User {
    private Integer adminId;
    private String adminName;
    private String adminPassword;
    private String adminDevManageId;
    private String adminPhone;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminDevManageId() {
        return adminDevManageId;
    }

    public void setAdminDevManageId(String adminDevManageId) {
        this.adminDevManageId = adminDevManageId;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }
}
