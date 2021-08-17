package com.xue.vo;


public class ResultVo<T> {

    private int code;
    private String message;
    private T t;

    public ResultVo() {
    }

    public ResultVo(int code, String message, T t) {
        this.code = code;
        this.message = message;
        this.t = t;
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

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", t=" + t +
                '}';
    }

    public static <T> ResultVo ok(T t) {
        return new ResultVo(200, "请求成功", t);
    }
}
