package com.insp.cloudtest.util;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
* class: ResponseModel
* description: 响应模型
* @author: 刘猛
* create: 2019/6/12 17:43
* Created by IntelliJ IDEA.
**/
public class ResponseModel<T> implements Serializable{

    /**
     * 状态码
     */
    private int code = HttpStatus.OK.value();

    /**
     * 是否成功
     */
    private boolean success = true;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 返回结果
     */
    private T data;

    public ResponseModel() {
    }

    public ResponseModel(T data) {
        this.data = data;
    }

    public ResponseModel(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public ResponseModel(HttpStatus status, boolean success, String message) {
        this.code = status.value();
        this.success = success;
        this.message = message;
    }

    public ResponseModel(HttpStatus status, boolean success, String message, T data) {
        this.code = status.value();
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
