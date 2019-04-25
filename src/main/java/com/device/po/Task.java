package com.device.po;

public class Task {

    // 任务编号
    private int taskId;
    //计划编号
    private String taskOnmId;
    private String taskOnmContent;
    private String taskDevNo;

    //根据devNo 添加的设备名称
    private String taskDevName;
    private String taskStatus;
    private int taskError;
    private String taskTime;
    private String taskOnmerId;


    public String getTaskDevName() {
        return taskDevName;
    }

    public void setTaskDevName(String taskDevName) {
        this.taskDevName = taskDevName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskOnmId() {
        return taskOnmId;
    }

    public void setTaskOnmId(String taskOnmId) {
        this.taskOnmId = taskOnmId;
    }

    public String getTaskOnmContent() {
        return taskOnmContent;
    }

    public void setTaskOnmContent(String taskOnmContent) {
        this.taskOnmContent = taskOnmContent;
    }

    public String getTaskDevNo() {
        return taskDevNo;
    }

    public void setTaskDevNo(String taskDevNo) {
        this.taskDevNo = taskDevNo;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskError() {
        return taskError;
    }

    public void setTaskError(int taskError) {
        this.taskError = taskError;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskOnmerId() {
        return taskOnmerId;
    }

    public void setTaskOnmerId(String taskOnmerId) {
        this.taskOnmerId = taskOnmerId;
    }
}
