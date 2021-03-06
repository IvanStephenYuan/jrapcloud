package com.jrapcloud.common.base;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2019/12/21 10:25
 **/
public class ResponseData {
    private int code = 200;
    private String message = "";
    private Object data;
    private Boolean status;

    public static ResponseData ok(Object data) {
        return new ResponseData(data);
    }

    public static ResponseData fail() {
        return new ResponseData(null);
    }

    public static ResponseData fail(String message) {
        return new ResponseData(message);
    }

    public static ResponseData fail(String message, int code) {
        return new ResponseData(message, code);
    }

    public static ResponseData failByParam(String message) {
        return new ResponseData(message, ResponseCode.PARAM_ERROR_CODE.getCode());
    }

    public ResponseData(Object data) {
        super();
        this.data = data;
    }

    public ResponseData(String message) {
        super();
        this.message = message;
    }

    public ResponseData(String message, int code) {
        super();
        this.message = message;
        this.code = code;
    }

    public ResponseData() {
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
