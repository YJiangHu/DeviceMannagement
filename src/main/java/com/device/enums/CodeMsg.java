package com.device.enums;

public enum CodeMsg {
    SUCCESS(0, "成功"), USER_NOT_EXIST(1001, "用户不存在"), PASSWORD_ERROR(1002, "密码错误")
    , USER_REPEAT(1003, "用户已存在");

    private int code; //状态码
    private String msg; //信息

    private CodeMsg( int code,String msg ) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
