package com.device.vo;

public class WxResultVO {

    private String taskId;
    private String onmContent;
    private String onmName;
    private String onmId;
    private  int   isError;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOnmContent() {
        return onmContent;
    }

    public void setOnmContent(String onmContent) {
        this.onmContent = onmContent;
    }

    public String getOnmName() {
        return onmName;
    }

    public void setOnmName(String onmName) {
        this.onmName = onmName;
    }

    public String getOnmId() {
        return onmId;
    }

    public void setOnmId(String onmId) {
        this.onmId = onmId;
    }

    public int getIsError() {
        return isError;
    }

    public void setIsError(int isError) {
        this.isError = isError;
    }


}
